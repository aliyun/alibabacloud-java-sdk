// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class CreateLabelsetResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateLabelsetResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateLabelsetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLabelsetResponseBody self = new CreateLabelsetResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLabelsetResponseBody setData(CreateLabelsetResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateLabelsetResponseBodyData getData() {
        return this.data;
    }

    public CreateLabelsetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateLabelsetResponseBodyData extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("Id")
        public Long id;

        @NameInMap("LabelType")
        public String labelType;

        @NameInMap("Name")
        public String name;

        @NameInMap("Status")
        public String status;

        public static CreateLabelsetResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateLabelsetResponseBodyData self = new CreateLabelsetResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateLabelsetResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateLabelsetResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public CreateLabelsetResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateLabelsetResponseBodyData setLabelType(String labelType) {
            this.labelType = labelType;
            return this;
        }
        public String getLabelType() {
            return this.labelType;
        }

        public CreateLabelsetResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateLabelsetResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
