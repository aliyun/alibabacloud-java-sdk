// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class GetWorkspaceResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetWorkspaceResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetWorkspaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWorkspaceResponseBody self = new GetWorkspaceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWorkspaceResponseBody setData(GetWorkspaceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetWorkspaceResponseBodyData getData() {
        return this.data;
    }

    public GetWorkspaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetWorkspaceResponseBodyData extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        public static GetWorkspaceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetWorkspaceResponseBodyData self = new GetWorkspaceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetWorkspaceResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetWorkspaceResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public GetWorkspaceResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetWorkspaceResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetWorkspaceResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
