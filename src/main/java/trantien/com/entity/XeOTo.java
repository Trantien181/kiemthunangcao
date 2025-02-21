package trantien.com.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class XeOTo {
    private int id;

    private String ten;

    private float gia;

    private String ghiChu;
}
