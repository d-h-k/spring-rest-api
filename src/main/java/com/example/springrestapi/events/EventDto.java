package com.example.springrestapi.events;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class EventDto {

    public EventDto(String name) {
        this.name = name;
    }

    private Long id;
    @NotEmpty
    private String name;
    @NotEmpty
    private String description;
    @NotNull
    private LocalDateTime beginEnrollmentDateTime;
    @NotNull
    private LocalDateTime closeEnrollmentDateTime;
    @NotNull
    private LocalDateTime beginEventDateTime;
    @NotNull
    private LocalDateTime endEventDateTime;
    private String location; // (optional)
    @Min(0)
    private int basePrice; // (optional)
    @Min(0)
    private int maxPrice;  // (optional)
    @Min(0)
    private int limitOfEnrollment;


}

/*

// Gradle
implementation 'org.springframework.boot:spring-boot-starter-validation'

자주 사용하는 어노테이션은 이정도가 있음..



@NotNull : 해당 값에 Null을 허용하지 않음
@NotBlank : Null을 허용하지 않으며 문자가 한 개 이상 포함되어야 함 (공백 제외)
@NotEmpty : Null을 허용하지 않으며 공백 문자열을 허용하지 않음
@AssertTrue : true인지 확인
@Min : 값이 Min보다 작은지 확인
@Max : 값이 Max보다 큰지 확인
@Size : 값이 min과 max사이에 해당하는지 확인 (CharSequence, Collection, Map, Array에 해당)


@NotNull, @NotEmpty 및 @NotBlank
@NotNull , @NotEmpty 또는 @NotBlank 를 사용하여 Bean 속성이 비어 있지 않은지 확인할 수도 있습니다 . 이 세 가지 주석은 모두 동일한 작업을 수행하는 것처럼 들리지만 차이점이 있습니다.

@NotNull – 주석이 달린 값이 null이 아닌지 확인합니다. 하지만 비어 있을 수 있습니다. 주석 값은 모든 유형(문자열 또는 배열 또는 컬렉션 ...)일 수 있습니다.
@NotEmpty – 주석이 달린 요소가 null이나 비어 있지 않은지 확인합니다. 주석 값은 CharSequence, Collection, Map 및 배열일 수 있습니다.
@NotBlank – 주석이 달린 문자 시퀀스가 ​​null이 아니고 잘린 길이가 0보다 큰지 확인합니다. @NotEmpty와의 차이점은 이 제약 조건은 문자열에만 적용할 수 있고 후행 공백은 무시된다는 것입니다.

 */
