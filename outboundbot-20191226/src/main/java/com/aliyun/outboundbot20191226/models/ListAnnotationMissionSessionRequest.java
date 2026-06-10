// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListAnnotationMissionSessionRequest extends TeaModel {
    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8434a4b0-41fc-41b1-aa75-bbd1f2ab0c8d</p>
     */
    @NameInMap("AnnotationMissionId")
    public String annotationMissionId;

    /**
     * <p>The ID of the chat instance for the annotation task.</p>
     * <blockquote>
     * <p>Obtain this ID by calling the SaveAnnotationMissionSessionList operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>8434a4b0-41fc-41b1-aa75-bbd1f2ab0c8d</p>
     */
    @NameInMap("AnnotationMissionSessionId")
    public String annotationMissionSessionId;

    /**
     * <p>The environment.</p>
     * <blockquote>
     * <p>The default value is 2.</p>
     * </blockquote>
     * <p><strong>Enumeration values</strong></p>
     * <ul>
     * <li><p>0: NONE</p>
     * </li>
     * <li><p>1: Private cloud</p>
     * </li>
     * <li><p>2: Public cloud</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Environment")
    public Integer environment;

    /**
     * <p>The list of statuses to include.</p>
     * <blockquote>
     * <p>The format is [1]. Fill the array with specific enumeration values.</p>
     * </blockquote>
     * <p><strong>Enumeration values</strong></p>
     * <ul>
     * <li><p>1: Correctly detected</p>
     * </li>
     * <li><p>2: Incorrectly detected</p>
     * </li>
     * <li><p>8: Invalid data</p>
     * </li>
     * <li><p>4: Uncovered intent</p>
     * </li>
     * <li><p>16: Transcription error</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[1]</p>
     */
    @NameInMap("IncludeStatusListJsonString")
    public String includeStatusListJsonString;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("PageIndex")
    public Integer pageIndex;

    /**
     * <p>The number of records to display on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListAnnotationMissionSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAnnotationMissionSessionRequest self = new ListAnnotationMissionSessionRequest();
        return TeaModel.build(map, self);
    }

    public ListAnnotationMissionSessionRequest setAnnotationMissionId(String annotationMissionId) {
        this.annotationMissionId = annotationMissionId;
        return this;
    }
    public String getAnnotationMissionId() {
        return this.annotationMissionId;
    }

    public ListAnnotationMissionSessionRequest setAnnotationMissionSessionId(String annotationMissionSessionId) {
        this.annotationMissionSessionId = annotationMissionSessionId;
        return this;
    }
    public String getAnnotationMissionSessionId() {
        return this.annotationMissionSessionId;
    }

    public ListAnnotationMissionSessionRequest setEnvironment(Integer environment) {
        this.environment = environment;
        return this;
    }
    public Integer getEnvironment() {
        return this.environment;
    }

    public ListAnnotationMissionSessionRequest setIncludeStatusListJsonString(String includeStatusListJsonString) {
        this.includeStatusListJsonString = includeStatusListJsonString;
        return this;
    }
    public String getIncludeStatusListJsonString() {
        return this.includeStatusListJsonString;
    }

    public ListAnnotationMissionSessionRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListAnnotationMissionSessionRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
