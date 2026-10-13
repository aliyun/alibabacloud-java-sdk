// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListAnnotationMissionSessionRequest extends TeaModel {
    /**
     * <p>The annotation mission ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8434a4b0-41fc-41b1-aa75-bbd1f2ab0c8d</p>
     */
    @NameInMap("AnnotationMissionId")
    public String annotationMissionId;

    /**
     * <p>The annotation mission chat instance ID.</p>
     * <blockquote>
     * <p>Obtained by calling the SaveAnnotationMissionSessionList operation.</p>
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
     * <p>Default value: 2.</p>
     * </blockquote>
     * <p><strong>Valid values:</strong></p>
     * <ul>
     * <li>0: NONE.</li>
     * <li>1: Private cloud.</li>
     * <li>2: Public cloud.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Environment")
    public Integer environment;

    /**
     * <p>The list of included statuses.</p>
     * <blockquote>
     * <p>The format is [1]. Specify the actual enum values in the array.</p>
     * </blockquote>
     * <p><strong>Valid values:</strong></p>
     * <ul>
     * <li>1: Correct recognition.</li>
     * <li>2: Incorrect recognition.</li>
     * <li>8: Invalid data.</li>
     * <li>4: Uncovered intent.</li>
     * <li>16: Transcription misrecognition.</li>
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
     * <p>The number of entries to return on each page.</p>
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
