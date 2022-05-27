// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class GetLabelsetResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetLabelsetResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetLabelsetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLabelsetResponseBody self = new GetLabelsetResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLabelsetResponseBody setData(GetLabelsetResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetLabelsetResponseBodyData getData() {
        return this.data;
    }

    public GetLabelsetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetLabelsetResponseBodyData extends TeaModel {
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

        @NameInMap("Total")
        public Long total;

        public static GetLabelsetResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetLabelsetResponseBodyData self = new GetLabelsetResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetLabelsetResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetLabelsetResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public GetLabelsetResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetLabelsetResponseBodyData setLabelType(String labelType) {
            this.labelType = labelType;
            return this;
        }
        public String getLabelType() {
            return this.labelType;
        }

        public GetLabelsetResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLabelsetResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetLabelsetResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
