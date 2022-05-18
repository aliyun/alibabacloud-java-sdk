// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class GetSlotResponseBody extends TeaModel {
    // 错误码
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetSlotResponseBodyData data;

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

    public static GetSlotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSlotResponseBody self = new GetSlotResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSlotResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSlotResponseBody setData(GetSlotResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSlotResponseBodyData getData() {
        return this.data;
    }

    public GetSlotResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetSlotResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSlotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSlotResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSlotResponseBodyDataBlackEntryList extends TeaModel {
        // 词条id
        @NameInMap("Id")
        public Integer id;

        // 槽位id
        @NameInMap("SlotId")
        public Integer slotId;

        // 词条值
        @NameInMap("Value")
        public String value;

        public static GetSlotResponseBodyDataBlackEntryList build(java.util.Map<String, ?> map) throws Exception {
            GetSlotResponseBodyDataBlackEntryList self = new GetSlotResponseBodyDataBlackEntryList();
            return TeaModel.build(map, self);
        }

        public GetSlotResponseBodyDataBlackEntryList setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public GetSlotResponseBodyDataBlackEntryList setSlotId(Integer slotId) {
            this.slotId = slotId;
            return this;
        }
        public Integer getSlotId() {
            return this.slotId;
        }

        public GetSlotResponseBodyDataBlackEntryList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetSlotResponseBodyDataSimilarEntryListCoreEntry extends TeaModel {
        // 词条id
        @NameInMap("Id")
        public Integer id;

        // 槽位id
        @NameInMap("SlotId")
        public Integer slotId;

        // 词条值
        @NameInMap("Value")
        public String value;

        public static GetSlotResponseBodyDataSimilarEntryListCoreEntry build(java.util.Map<String, ?> map) throws Exception {
            GetSlotResponseBodyDataSimilarEntryListCoreEntry self = new GetSlotResponseBodyDataSimilarEntryListCoreEntry();
            return TeaModel.build(map, self);
        }

        public GetSlotResponseBodyDataSimilarEntryListCoreEntry setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public GetSlotResponseBodyDataSimilarEntryListCoreEntry setSlotId(Integer slotId) {
            this.slotId = slotId;
            return this;
        }
        public Integer getSlotId() {
            return this.slotId;
        }

        public GetSlotResponseBodyDataSimilarEntryListCoreEntry setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetSlotResponseBodyDataSimilarEntryListSimilarEntries extends TeaModel {
        // 词条id
        @NameInMap("Id")
        public Integer id;

        // 槽位id
        @NameInMap("SlotId")
        public Integer slotId;

        // 词条值
        @NameInMap("Value")
        public String value;

        public static GetSlotResponseBodyDataSimilarEntryListSimilarEntries build(java.util.Map<String, ?> map) throws Exception {
            GetSlotResponseBodyDataSimilarEntryListSimilarEntries self = new GetSlotResponseBodyDataSimilarEntryListSimilarEntries();
            return TeaModel.build(map, self);
        }

        public GetSlotResponseBodyDataSimilarEntryListSimilarEntries setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public GetSlotResponseBodyDataSimilarEntryListSimilarEntries setSlotId(Integer slotId) {
            this.slotId = slotId;
            return this;
        }
        public Integer getSlotId() {
            return this.slotId;
        }

        public GetSlotResponseBodyDataSimilarEntryListSimilarEntries setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetSlotResponseBodyDataSimilarEntryList extends TeaModel {
        // 核心词实体
        @NameInMap("CoreEntry")
        public GetSlotResponseBodyDataSimilarEntryListCoreEntry coreEntry;

        // 同义词
        @NameInMap("SimilarEntries")
        public java.util.List<GetSlotResponseBodyDataSimilarEntryListSimilarEntries> similarEntries;

        public static GetSlotResponseBodyDataSimilarEntryList build(java.util.Map<String, ?> map) throws Exception {
            GetSlotResponseBodyDataSimilarEntryList self = new GetSlotResponseBodyDataSimilarEntryList();
            return TeaModel.build(map, self);
        }

        public GetSlotResponseBodyDataSimilarEntryList setCoreEntry(GetSlotResponseBodyDataSimilarEntryListCoreEntry coreEntry) {
            this.coreEntry = coreEntry;
            return this;
        }
        public GetSlotResponseBodyDataSimilarEntryListCoreEntry getCoreEntry() {
            return this.coreEntry;
        }

        public GetSlotResponseBodyDataSimilarEntryList setSimilarEntries(java.util.List<GetSlotResponseBodyDataSimilarEntryListSimilarEntries> similarEntries) {
            this.similarEntries = similarEntries;
            return this;
        }
        public java.util.List<GetSlotResponseBodyDataSimilarEntryListSimilarEntries> getSimilarEntries() {
            return this.similarEntries;
        }

    }

    public static class GetSlotResponseBodyData extends TeaModel {
        // 槽位中文名
        @NameInMap("Alias")
        public String alias;

        // 黑名单词信息
        @NameInMap("BlackEntryList")
        public java.util.List<GetSlotResponseBodyDataBlackEntryList> blackEntryList;

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

        // 槽位开启状态
        @NameInMap("OwnStatus")
        public Integer ownStatus;

        // 核心同义词信息
        @NameInMap("SimilarEntryList")
        public java.util.List<GetSlotResponseBodyDataSimilarEntryList> similarEntryList;

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

        public static GetSlotResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSlotResponseBodyData self = new GetSlotResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSlotResponseBodyData setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public GetSlotResponseBodyData setBlackEntryList(java.util.List<GetSlotResponseBodyDataBlackEntryList> blackEntryList) {
            this.blackEntryList = blackEntryList;
            return this;
        }
        public java.util.List<GetSlotResponseBodyDataBlackEntryList> getBlackEntryList() {
            return this.blackEntryList;
        }

        public GetSlotResponseBodyData setCategoryId(Integer categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Integer getCategoryId() {
            return this.categoryId;
        }

        public GetSlotResponseBodyData setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public GetSlotResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetSlotResponseBodyData setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public GetSlotResponseBodyData setOwnStatus(Integer ownStatus) {
            this.ownStatus = ownStatus;
            return this;
        }
        public Integer getOwnStatus() {
            return this.ownStatus;
        }

        public GetSlotResponseBodyData setSimilarEntryList(java.util.List<GetSlotResponseBodyDataSimilarEntryList> similarEntryList) {
            this.similarEntryList = similarEntryList;
            return this;
        }
        public java.util.List<GetSlotResponseBodyDataSimilarEntryList> getSimilarEntryList() {
            return this.similarEntryList;
        }

        public GetSlotResponseBodyData setSource(Integer source) {
            this.source = source;
            return this;
        }
        public Integer getSource() {
            return this.source;
        }

        public GetSlotResponseBodyData setSourceName(String sourceName) {
            this.sourceName = sourceName;
            return this;
        }
        public String getSourceName() {
            return this.sourceName;
        }

        public GetSlotResponseBodyData setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public GetSlotResponseBodyData setTypeName(String typeName) {
            this.typeName = typeName;
            return this;
        }
        public String getTypeName() {
            return this.typeName;
        }

    }

}
