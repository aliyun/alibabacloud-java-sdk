// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class ListSlotsResponseBody extends TeaModel {
    // 错误码
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListSlotsResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // 错误信息
    @NameInMap("Message")
    public String message;

    // 请求id
    @NameInMap("RequestId")
    public String requestId;

    // 是否成功
    @NameInMap("Success")
    public Boolean success;

    public static ListSlotsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSlotsResponseBody self = new ListSlotsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSlotsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSlotsResponseBody setData(ListSlotsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListSlotsResponseBodyData getData() {
        return this.data;
    }

    public ListSlotsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListSlotsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSlotsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSlotsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListSlotsResponseBodyDataResultData extends TeaModel {
        // 槽位中文名
        @NameInMap("Alias")
        public String alias;

        // 槽位类别id
        @NameInMap("CategoryId")
        public Integer categoryId;

        // 槽位类别名称
        @NameInMap("CategoryName")
        public String categoryName;

        // 槽位中文描述
        @NameInMap("Description")
        public String description;

        // 槽位id
        @NameInMap("Id")
        public Integer id;

        @NameInMap("OwnStatus")
        public Integer ownStatus;

        // 槽位来源， 0表示官方槽位，1表示自定义槽位
        @NameInMap("Source")
        public Integer source;

        // 槽位来源名称
        @NameInMap("SourceName")
        public String sourceName;

        // 槽位类型，0枚举型号，1表示区间型，2表示函数型
        @NameInMap("Type")
        public Integer type;

        // 槽位类型名称
        @NameInMap("TypeName")
        public String typeName;

        public static ListSlotsResponseBodyDataResultData build(java.util.Map<String, ?> map) throws Exception {
            ListSlotsResponseBodyDataResultData self = new ListSlotsResponseBodyDataResultData();
            return TeaModel.build(map, self);
        }

        public ListSlotsResponseBodyDataResultData setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public ListSlotsResponseBodyDataResultData setCategoryId(Integer categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Integer getCategoryId() {
            return this.categoryId;
        }

        public ListSlotsResponseBodyDataResultData setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public ListSlotsResponseBodyDataResultData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListSlotsResponseBodyDataResultData setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public ListSlotsResponseBodyDataResultData setOwnStatus(Integer ownStatus) {
            this.ownStatus = ownStatus;
            return this;
        }
        public Integer getOwnStatus() {
            return this.ownStatus;
        }

        public ListSlotsResponseBodyDataResultData setSource(Integer source) {
            this.source = source;
            return this;
        }
        public Integer getSource() {
            return this.source;
        }

        public ListSlotsResponseBodyDataResultData setSourceName(String sourceName) {
            this.sourceName = sourceName;
            return this;
        }
        public String getSourceName() {
            return this.sourceName;
        }

        public ListSlotsResponseBodyDataResultData setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public ListSlotsResponseBodyDataResultData setTypeName(String typeName) {
            this.typeName = typeName;
            return this;
        }
        public String getTypeName() {
            return this.typeName;
        }

    }

    public static class ListSlotsResponseBodyData extends TeaModel {
        @NameInMap("PageNo")
        public Integer pageNo;

        @NameInMap("ResultData")
        public java.util.List<ListSlotsResponseBodyDataResultData> resultData;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListSlotsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSlotsResponseBodyData self = new ListSlotsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSlotsResponseBodyData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public ListSlotsResponseBodyData setResultData(java.util.List<ListSlotsResponseBodyDataResultData> resultData) {
            this.resultData = resultData;
            return this;
        }
        public java.util.List<ListSlotsResponseBodyDataResultData> getResultData() {
            return this.resultData;
        }

        public ListSlotsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
