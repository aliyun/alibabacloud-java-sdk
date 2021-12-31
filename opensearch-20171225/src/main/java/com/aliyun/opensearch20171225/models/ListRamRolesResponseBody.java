// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListRamRolesResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListRamRolesResponseBodyResult> result;

    public static ListRamRolesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRamRolesResponseBody self = new ListRamRolesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRamRolesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRamRolesResponseBody setResult(java.util.List<ListRamRolesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListRamRolesResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListRamRolesResponseBodyResult extends TeaModel {
        @NameInMap("assumed")
        public Boolean assumed;

        @NameInMap("name")
        public String name;

        @NameInMap("service")
        public String service;

        @NameInMap("template_id")
        public String templateId;

        public static ListRamRolesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListRamRolesResponseBodyResult self = new ListRamRolesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListRamRolesResponseBodyResult setAssumed(Boolean assumed) {
            this.assumed = assumed;
            return this;
        }
        public Boolean getAssumed() {
            return this.assumed;
        }

        public ListRamRolesResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListRamRolesResponseBodyResult setService(String service) {
            this.service = service;
            return this;
        }
        public String getService() {
            return this.service;
        }

        public ListRamRolesResponseBodyResult setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

}
