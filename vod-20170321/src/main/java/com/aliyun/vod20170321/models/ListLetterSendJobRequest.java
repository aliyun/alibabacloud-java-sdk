// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListLetterSendJobRequest extends TeaModel {
    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("ToAddress")
    public String toAddress;

    @NameInMap("DetectionId")
    public String detectionId;

    public static ListLetterSendJobRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLetterSendJobRequest self = new ListLetterSendJobRequest();
        return TeaModel.build(map, self);
    }

    public ListLetterSendJobRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public ListLetterSendJobRequest setToAddress(String toAddress) {
        this.toAddress = toAddress;
        return this;
    }
    public String getToAddress() {
        return this.toAddress;
    }

    public ListLetterSendJobRequest setDetectionId(String detectionId) {
        this.detectionId = detectionId;
        return this;
    }
    public String getDetectionId() {
        return this.detectionId;
    }

}
