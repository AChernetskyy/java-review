package orangeInventoryTask;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Orange {
    private int weight;
    private Color color;
}
