// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class DraftValidationDetail extends TeaModel {
    @NameInMap("draftMetaInfoErrorDetails")
    public java.util.List<DraftMetaInfoErrorDetail> draftMetaInfoErrorDetails;

    @NameInMap("sqlErrorDetail")
    public ValidationErrorDetails sqlErrorDetail;

    @NameInMap("sqlValidationResult")
    public String sqlValidationResult;

    public static DraftValidationDetail build(java.util.Map<String, ?> map) throws Exception {
        DraftValidationDetail self = new DraftValidationDetail();
        return TeaModel.build(map, self);
    }

    public DraftValidationDetail setDraftMetaInfoErrorDetails(java.util.List<DraftMetaInfoErrorDetail> draftMetaInfoErrorDetails) {
        this.draftMetaInfoErrorDetails = draftMetaInfoErrorDetails;
        return this;
    }
    public java.util.List<DraftMetaInfoErrorDetail> getDraftMetaInfoErrorDetails() {
        return this.draftMetaInfoErrorDetails;
    }

    public DraftValidationDetail setSqlErrorDetail(ValidationErrorDetails sqlErrorDetail) {
        this.sqlErrorDetail = sqlErrorDetail;
        return this;
    }
    public ValidationErrorDetails getSqlErrorDetail() {
        return this.sqlErrorDetail;
    }

    public DraftValidationDetail setSqlValidationResult(String sqlValidationResult) {
        this.sqlValidationResult = sqlValidationResult;
        return this;
    }
    public String getSqlValidationResult() {
        return this.sqlValidationResult;
    }

}
