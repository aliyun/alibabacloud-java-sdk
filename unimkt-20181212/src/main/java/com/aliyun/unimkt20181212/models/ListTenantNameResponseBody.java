// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class ListTenantNameResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public java.util.List<ListTenantNameResponseBodyModel> model;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Total")
    public Long total;

    public static ListTenantNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTenantNameResponseBody self = new ListTenantNameResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTenantNameResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTenantNameResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTenantNameResponseBody setModel(java.util.List<ListTenantNameResponseBodyModel> model) {
        this.model = model;
        return this;
    }
    public java.util.List<ListTenantNameResponseBodyModel> getModel() {
        return this.model;
    }

    public ListTenantNameResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTenantNameResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTenantNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTenantNameResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListTenantNameResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListTenantNameResponseBodyModel extends TeaModel {
        @NameInMap("TenantDescription")
        public String tenantDescription;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("TenantName")
        public String tenantName;

        public static ListTenantNameResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            ListTenantNameResponseBodyModel self = new ListTenantNameResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public ListTenantNameResponseBodyModel setTenantDescription(String tenantDescription) {
            this.tenantDescription = tenantDescription;
            return this;
        }
        public String getTenantDescription() {
            return this.tenantDescription;
        }

        public ListTenantNameResponseBodyModel setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListTenantNameResponseBodyModel setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

    }

}
