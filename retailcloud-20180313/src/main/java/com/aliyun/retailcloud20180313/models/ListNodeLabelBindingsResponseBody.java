// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class ListNodeLabelBindingsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<ListNodeLabelBindingsResponseBodyData> data;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListNodeLabelBindingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNodeLabelBindingsResponseBody self = new ListNodeLabelBindingsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNodeLabelBindingsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListNodeLabelBindingsResponseBody setData(java.util.List<ListNodeLabelBindingsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListNodeLabelBindingsResponseBodyData> getData() {
        return this.data;
    }

    public ListNodeLabelBindingsResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ListNodeLabelBindingsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListNodeLabelBindingsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListNodeLabelBindingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNodeLabelBindingsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListNodeLabelBindingsResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("LabelKey")
        public String labelKey;

        @NameInMap("LabelValue")
        public String labelValue;

        public static ListNodeLabelBindingsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListNodeLabelBindingsResponseBodyData self = new ListNodeLabelBindingsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListNodeLabelBindingsResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListNodeLabelBindingsResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListNodeLabelBindingsResponseBodyData setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListNodeLabelBindingsResponseBodyData setLabelKey(String labelKey) {
            this.labelKey = labelKey;
            return this;
        }
        public String getLabelKey() {
            return this.labelKey;
        }

        public ListNodeLabelBindingsResponseBodyData setLabelValue(String labelValue) {
            this.labelValue = labelValue;
            return this;
        }
        public String getLabelValue() {
            return this.labelValue;
        }

    }

}
