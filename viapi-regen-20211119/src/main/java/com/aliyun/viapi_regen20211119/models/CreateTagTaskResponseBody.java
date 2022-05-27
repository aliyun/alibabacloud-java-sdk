// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class CreateTagTaskResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateTagTaskResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateTagTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTagTaskResponseBody self = new CreateTagTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTagTaskResponseBody setData(CreateTagTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateTagTaskResponseBodyData getData() {
        return this.data;
    }

    public CreateTagTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateTagTaskResponseBodyData extends TeaModel {
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

        public static CreateTagTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateTagTaskResponseBodyData self = new CreateTagTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateTagTaskResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateTagTaskResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public CreateTagTaskResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateTagTaskResponseBodyData setLabelType(String labelType) {
            this.labelType = labelType;
            return this;
        }
        public String getLabelType() {
            return this.labelType;
        }

        public CreateTagTaskResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateTagTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
