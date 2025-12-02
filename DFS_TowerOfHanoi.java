import java.util.*;

public class DFS_TowerOfHanoi {

    static class State {
        List<Integer>[] pegs;

        @SuppressWarnings("unchecked")
        State() {
            pegs = new List[3];
            for (int i = 0; i < 3; i++)
                pegs[i] = new ArrayList<>();
        }

        State cloneState() {
            State s = new State();
            for (int i = 0; i < 3; i++)
                s.pegs[i].addAll(this.pegs[i]);
            return s;
        }

        boolean isGoal() {
            return pegs[0].isEmpty() && pegs[1].isEmpty() && pegs[2].size() == 3;
        }

        @Override
        public String toString() {
            return pegs[0] + " | " + pegs[1] + " | " + pegs[2];
        }
    }

    static Set<String> visited = new HashSet<>();
    static List<String> path = new ArrayList<>();

    static void dfs(State state) {
        if (state.isGoal()) {
            System.out.println("Solution path:");
            for (String p : path) System.out.println(p);
            System.out.println(state);
            System.exit(0);
        }

        visited.add(state.toString());

        for (int from = 0; from < 3; from++) {
            if (state.pegs[from].isEmpty()) continue;

            for (int to = 0; to < 3; to++) {
                if (from == to) continue;

                if (!state.pegs[to].isEmpty() &&
                        state.pegs[from].get(state.pegs[from].size() - 1) >
                        state.pegs[to].get(state.pegs[to].size() - 1))
                    continue;

                State next = state.cloneState();
                int disk = next.pegs[from].remove(next.pegs[from].size() - 1);
                next.pegs[to].add(disk);

                if (!visited.contains(next.toString())) {
                    path.add("Move disk " + disk + " from Peg " + from + " to Peg " + to);
                    dfs(next);
                    path.remove(path.size() - 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        State start = new State();
        start.pegs[0].addAll(Arrays.asList(3, 2, 1));  // 3 disks

        System.out.println("DFS Search Started...");
        dfs(start);
    }
}