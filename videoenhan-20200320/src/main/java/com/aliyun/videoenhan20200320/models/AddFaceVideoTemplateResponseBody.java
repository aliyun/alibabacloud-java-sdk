// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class AddFaceVideoTemplateResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Date")
    public AddFaceVideoTemplateResponseBodyDate date;

    public static AddFaceVideoTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddFaceVideoTemplateResponseBody self = new AddFaceVideoTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public AddFaceVideoTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddFaceVideoTemplateResponseBody setDate(AddFaceVideoTemplateResponseBodyDate date) {
        this.date = date;
        return this;
    }
    public AddFaceVideoTemplateResponseBodyDate getDate() {
        return this.date;
    }

    public static class AddFaceVideoTemplateResponseBodyDate extends TeaModel {
        @NameInMap("TemplateId")
        public String templateId;

        public static AddFaceVideoTemplateResponseBodyDate build(java.util.Map<String, ?> map) throws Exception {
            AddFaceVideoTemplateResponseBodyDate self = new AddFaceVideoTemplateResponseBodyDate();
            return TeaModel.build(map, self);
        }

        public AddFaceVideoTemplateResponseBodyDate setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

}
