package org.lucycato.productqueryservice.adapter.out.persistence.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.lucycato.productqueryservice.domain.enums.CourseSeriesCategory;
import org.lucycato.productqueryservice.domain.enums.CourseSeriesStatus;
import org.lucycato.productqueryservice.domain.enums.SubjectCategory;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;
import java.util.List;

@Table("course_series")
@Getter
@Setter
@NoArgsConstructor
public class CourseSeriesR2dbcEntity {
    @Id
    private Long id;

    private Long teacherId;

    private String courseSeriesImageUrl;

    private String courseSeriesTitle;

    private String courseSeriesDescription;

    private List<String> courseSeriesExplainImageUrlsJson;

    private String subjectCategory;

    private String courseSeriesCategory;

    private String courseSeriesStatus;

    @CreatedDate
    private LocalDateTime courseSeriesCreatedAt;

    @LastModifiedDate
    private LocalDateTime courseSeriesModifiedAt;
}
