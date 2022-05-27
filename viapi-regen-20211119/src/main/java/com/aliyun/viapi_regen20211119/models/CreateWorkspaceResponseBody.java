// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class CreateWorkspaceResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateWorkspaceResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateWorkspaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkspaceResponseBody self = new CreateWorkspaceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateWorkspaceResponseBody setData(CreateWorkspaceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateWorkspaceResponseBodyData getData() {
        return this.data;
    }

    public CreateWorkspaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateWorkspaceResponseBodyData extends TeaModel {
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

        public static CreateWorkspaceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkspaceResponseBodyData self = new CreateWorkspaceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateWorkspaceResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateWorkspaceResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public CreateWorkspaceResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateWorkspaceResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateWorkspaceResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
