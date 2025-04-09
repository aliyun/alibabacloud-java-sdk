// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GetAnnotationMissionSummaryRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>50e53ac8-24a4-46d5-b174-ee88867f4780</p>
     */
    @NameInMap("AnnotationMissionId")
    public String annotationMissionId;

    public static GetAnnotationMissionSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAnnotationMissionSummaryRequest self = new GetAnnotationMissionSummaryRequest();
        return TeaModel.build(map, self);
    }

    public GetAnnotationMissionSummaryRequest setAnnotationMissionId(String annotationMissionId) {
        this.annotationMissionId = annotationMissionId;
        return this;
    }
    public String getAnnotationMissionId() {
        return this.annotationMissionId;
    }

}
