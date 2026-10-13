// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListAnnotationMissionRequest extends TeaModel {
    /**
     * <p>The ID of the annotation task.</p>
     * 
     * <strong>example:</strong>
     * <p>0943abcb-bd7d-4ace-8cf7-97d39d4dd0b9</p>
     */
    @NameInMap("AnnotationMissionId")
    public String annotationMissionId;

    /**
     * <p>The name of the annotation task.</p>
     * 
     * <strong>example:</strong>
     * <p>Panorama service scenario - Annotation task - 20230316-103253</p>
     */
    @NameInMap("AnnotationMissionName")
    public String annotationMissionName;

    /**
     * <p>The annotation status filter. This parameter is deprecated.</p>
     */
    @NameInMap("AnnotationStatusListFilter")
    public java.util.List<Integer> annotationStatusListFilter;

    /**
     * <p>The annotation status filter.</p>
     * <blockquote>
     * <p>The format is [1]. You can select multiple filter conditions. The valid values are as follows:</p>
     * </blockquote>
     * <ul>
     * <li>1: In progress.</li>
     * <li>2: Completed.</li>
     * <li>3: Closed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[1]</p>
     */
    @NameInMap("AnnotationStatusListStringFilter")
    public String annotationStatusListStringFilter;

    /**
     * <p>The end time for the annotation task creation filter.</p>
     * 
     * <strong>example:</strong>
     * <p>1673280000000</p>
     */
    @NameInMap("CreateTimeEndFilter")
    public Long createTimeEndFilter;

    /**
     * <p>The start time for the annotation task creation filter.</p>
     * 
     * <strong>example:</strong>
     * <p>1661961600000</p>
     */
    @NameInMap("CreateTimeStartFilter")
    public Long createTimeStartFilter;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>191ef468-75a2-4004-9441-a5c31bf5cd9d</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageIndex")
    public Integer pageIndex;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListAnnotationMissionRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAnnotationMissionRequest self = new ListAnnotationMissionRequest();
        return TeaModel.build(map, self);
    }

    public ListAnnotationMissionRequest setAnnotationMissionId(String annotationMissionId) {
        this.annotationMissionId = annotationMissionId;
        return this;
    }
    public String getAnnotationMissionId() {
        return this.annotationMissionId;
    }

    public ListAnnotationMissionRequest setAnnotationMissionName(String annotationMissionName) {
        this.annotationMissionName = annotationMissionName;
        return this;
    }
    public String getAnnotationMissionName() {
        return this.annotationMissionName;
    }

    public ListAnnotationMissionRequest setAnnotationStatusListFilter(java.util.List<Integer> annotationStatusListFilter) {
        this.annotationStatusListFilter = annotationStatusListFilter;
        return this;
    }
    public java.util.List<Integer> getAnnotationStatusListFilter() {
        return this.annotationStatusListFilter;
    }

    public ListAnnotationMissionRequest setAnnotationStatusListStringFilter(String annotationStatusListStringFilter) {
        this.annotationStatusListStringFilter = annotationStatusListStringFilter;
        return this;
    }
    public String getAnnotationStatusListStringFilter() {
        return this.annotationStatusListStringFilter;
    }

    public ListAnnotationMissionRequest setCreateTimeEndFilter(Long createTimeEndFilter) {
        this.createTimeEndFilter = createTimeEndFilter;
        return this;
    }
    public Long getCreateTimeEndFilter() {
        return this.createTimeEndFilter;
    }

    public ListAnnotationMissionRequest setCreateTimeStartFilter(Long createTimeStartFilter) {
        this.createTimeStartFilter = createTimeStartFilter;
        return this;
    }
    public Long getCreateTimeStartFilter() {
        return this.createTimeStartFilter;
    }

    public ListAnnotationMissionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListAnnotationMissionRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListAnnotationMissionRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
