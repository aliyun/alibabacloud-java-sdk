// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class AsyncDraftValidateResult extends TeaModel {
    @NameInMap("draftValidationDetail")
    public DraftValidationDetail draftValidationDetail;

    @NameInMap("message")
    public String message;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("ticketStatus")
    public String ticketStatus;

    public static AsyncDraftValidateResult build(java.util.Map<String, ?> map) throws Exception {
        AsyncDraftValidateResult self = new AsyncDraftValidateResult();
        return TeaModel.build(map, self);
    }

    public AsyncDraftValidateResult setDraftValidationDetail(DraftValidationDetail draftValidationDetail) {
        this.draftValidationDetail = draftValidationDetail;
        return this;
    }
    public DraftValidationDetail getDraftValidationDetail() {
        return this.draftValidationDetail;
    }

    public AsyncDraftValidateResult setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AsyncDraftValidateResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public AsyncDraftValidateResult setTicketStatus(String ticketStatus) {
        this.ticketStatus = ticketStatus;
        return this;
    }
    public String getTicketStatus() {
        return this.ticketStatus;
    }

}
