// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.notifications20241225.models;

import com.aliyun.tea.*;

public class ReadMessageContentResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ReadMessageContentResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ReadMessageContentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReadMessageContentResponseBody self = new ReadMessageContentResponseBody();
        return TeaModel.build(map, self);
    }

    public ReadMessageContentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ReadMessageContentResponseBody setData(ReadMessageContentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ReadMessageContentResponseBodyData getData() {
        return this.data;
    }

    public ReadMessageContentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ReadMessageContentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReadMessageContentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ReadMessageContentResponseBodyDataDatasItem extends TeaModel {
        @NameInMap("CategoryName")
        public String categoryName;

        @NameInMap("ClassId")
        public Long classId;

        @NameInMap("Content")
        public String content;

        @NameInMap("Deleted")
        public Integer deleted;

        @NameInMap("GmtCreated")
        public Long gmtCreated;

        @NameInMap("GmtUpdate")
        public Long gmtUpdate;

        @NameInMap("MassId")
        public Long massId;

        @NameInMap("Memo")
        public String memo;

        @NameInMap("MsgId")
        public Long msgId;

        @NameInMap("Status")
        public Long status;

        @NameInMap("Title")
        public String title;

        public static ReadMessageContentResponseBodyDataDatasItem build(java.util.Map<String, ?> map) throws Exception {
            ReadMessageContentResponseBodyDataDatasItem self = new ReadMessageContentResponseBodyDataDatasItem();
            return TeaModel.build(map, self);
        }

        public ReadMessageContentResponseBodyDataDatasItem setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public ReadMessageContentResponseBodyDataDatasItem setClassId(Long classId) {
            this.classId = classId;
            return this;
        }
        public Long getClassId() {
            return this.classId;
        }

        public ReadMessageContentResponseBodyDataDatasItem setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ReadMessageContentResponseBodyDataDatasItem setDeleted(Integer deleted) {
            this.deleted = deleted;
            return this;
        }
        public Integer getDeleted() {
            return this.deleted;
        }

        public ReadMessageContentResponseBodyDataDatasItem setGmtCreated(Long gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public Long getGmtCreated() {
            return this.gmtCreated;
        }

        public ReadMessageContentResponseBodyDataDatasItem setGmtUpdate(Long gmtUpdate) {
            this.gmtUpdate = gmtUpdate;
            return this;
        }
        public Long getGmtUpdate() {
            return this.gmtUpdate;
        }

        public ReadMessageContentResponseBodyDataDatasItem setMassId(Long massId) {
            this.massId = massId;
            return this;
        }
        public Long getMassId() {
            return this.massId;
        }

        public ReadMessageContentResponseBodyDataDatasItem setMemo(String memo) {
            this.memo = memo;
            return this;
        }
        public String getMemo() {
            return this.memo;
        }

        public ReadMessageContentResponseBodyDataDatasItem setMsgId(Long msgId) {
            this.msgId = msgId;
            return this;
        }
        public Long getMsgId() {
            return this.msgId;
        }

        public ReadMessageContentResponseBodyDataDatasItem setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public ReadMessageContentResponseBodyDataDatasItem setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class ReadMessageContentResponseBodyDataDatasLastItem extends TeaModel {
        @NameInMap("CategoryName")
        public String categoryName;

        @NameInMap("ClassId")
        public Long classId;

        @NameInMap("Content")
        public String content;

        @NameInMap("Deleted")
        public Integer deleted;

        @NameInMap("GmtCreated")
        public Long gmtCreated;

        @NameInMap("GmtUpdate")
        public Long gmtUpdate;

        @NameInMap("MassId")
        public Long massId;

        @NameInMap("Memo")
        public String memo;

        @NameInMap("MsgId")
        public Long msgId;

        @NameInMap("Status")
        public Long status;

        @NameInMap("Title")
        public String title;

        public static ReadMessageContentResponseBodyDataDatasLastItem build(java.util.Map<String, ?> map) throws Exception {
            ReadMessageContentResponseBodyDataDatasLastItem self = new ReadMessageContentResponseBodyDataDatasLastItem();
            return TeaModel.build(map, self);
        }

        public ReadMessageContentResponseBodyDataDatasLastItem setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public ReadMessageContentResponseBodyDataDatasLastItem setClassId(Long classId) {
            this.classId = classId;
            return this;
        }
        public Long getClassId() {
            return this.classId;
        }

        public ReadMessageContentResponseBodyDataDatasLastItem setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ReadMessageContentResponseBodyDataDatasLastItem setDeleted(Integer deleted) {
            this.deleted = deleted;
            return this;
        }
        public Integer getDeleted() {
            return this.deleted;
        }

        public ReadMessageContentResponseBodyDataDatasLastItem setGmtCreated(Long gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public Long getGmtCreated() {
            return this.gmtCreated;
        }

        public ReadMessageContentResponseBodyDataDatasLastItem setGmtUpdate(Long gmtUpdate) {
            this.gmtUpdate = gmtUpdate;
            return this;
        }
        public Long getGmtUpdate() {
            return this.gmtUpdate;
        }

        public ReadMessageContentResponseBodyDataDatasLastItem setMassId(Long massId) {
            this.massId = massId;
            return this;
        }
        public Long getMassId() {
            return this.massId;
        }

        public ReadMessageContentResponseBodyDataDatasLastItem setMemo(String memo) {
            this.memo = memo;
            return this;
        }
        public String getMemo() {
            return this.memo;
        }

        public ReadMessageContentResponseBodyDataDatasLastItem setMsgId(Long msgId) {
            this.msgId = msgId;
            return this;
        }
        public Long getMsgId() {
            return this.msgId;
        }

        public ReadMessageContentResponseBodyDataDatasLastItem setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public ReadMessageContentResponseBodyDataDatasLastItem setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class ReadMessageContentResponseBodyDataDatasNextItem extends TeaModel {
        @NameInMap("CategoryName")
        public String categoryName;

        @NameInMap("ClassId")
        public Long classId;

        @NameInMap("Content")
        public String content;

        @NameInMap("Deleted")
        public Integer deleted;

        @NameInMap("GmtCreated")
        public Long gmtCreated;

        @NameInMap("GmtUpdate")
        public Long gmtUpdate;

        @NameInMap("MassId")
        public Long massId;

        @NameInMap("Memo")
        public String memo;

        @NameInMap("MsgId")
        public Long msgId;

        @NameInMap("Status")
        public Long status;

        @NameInMap("Title")
        public String title;

        public static ReadMessageContentResponseBodyDataDatasNextItem build(java.util.Map<String, ?> map) throws Exception {
            ReadMessageContentResponseBodyDataDatasNextItem self = new ReadMessageContentResponseBodyDataDatasNextItem();
            return TeaModel.build(map, self);
        }

        public ReadMessageContentResponseBodyDataDatasNextItem setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public ReadMessageContentResponseBodyDataDatasNextItem setClassId(Long classId) {
            this.classId = classId;
            return this;
        }
        public Long getClassId() {
            return this.classId;
        }

        public ReadMessageContentResponseBodyDataDatasNextItem setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ReadMessageContentResponseBodyDataDatasNextItem setDeleted(Integer deleted) {
            this.deleted = deleted;
            return this;
        }
        public Integer getDeleted() {
            return this.deleted;
        }

        public ReadMessageContentResponseBodyDataDatasNextItem setGmtCreated(Long gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public Long getGmtCreated() {
            return this.gmtCreated;
        }

        public ReadMessageContentResponseBodyDataDatasNextItem setGmtUpdate(Long gmtUpdate) {
            this.gmtUpdate = gmtUpdate;
            return this;
        }
        public Long getGmtUpdate() {
            return this.gmtUpdate;
        }

        public ReadMessageContentResponseBodyDataDatasNextItem setMassId(Long massId) {
            this.massId = massId;
            return this;
        }
        public Long getMassId() {
            return this.massId;
        }

        public ReadMessageContentResponseBodyDataDatasNextItem setMemo(String memo) {
            this.memo = memo;
            return this;
        }
        public String getMemo() {
            return this.memo;
        }

        public ReadMessageContentResponseBodyDataDatasNextItem setMsgId(Long msgId) {
            this.msgId = msgId;
            return this;
        }
        public Long getMsgId() {
            return this.msgId;
        }

        public ReadMessageContentResponseBodyDataDatasNextItem setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public ReadMessageContentResponseBodyDataDatasNextItem setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class ReadMessageContentResponseBodyDataDatas extends TeaModel {
        @NameInMap("Item")
        public java.util.List<ReadMessageContentResponseBodyDataDatasItem> item;

        @NameInMap("LastItem")
        public java.util.List<ReadMessageContentResponseBodyDataDatasLastItem> lastItem;

        @NameInMap("NextItem")
        public java.util.List<ReadMessageContentResponseBodyDataDatasNextItem> nextItem;

        public static ReadMessageContentResponseBodyDataDatas build(java.util.Map<String, ?> map) throws Exception {
            ReadMessageContentResponseBodyDataDatas self = new ReadMessageContentResponseBodyDataDatas();
            return TeaModel.build(map, self);
        }

        public ReadMessageContentResponseBodyDataDatas setItem(java.util.List<ReadMessageContentResponseBodyDataDatasItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<ReadMessageContentResponseBodyDataDatasItem> getItem() {
            return this.item;
        }

        public ReadMessageContentResponseBodyDataDatas setLastItem(java.util.List<ReadMessageContentResponseBodyDataDatasLastItem> lastItem) {
            this.lastItem = lastItem;
            return this;
        }
        public java.util.List<ReadMessageContentResponseBodyDataDatasLastItem> getLastItem() {
            return this.lastItem;
        }

        public ReadMessageContentResponseBodyDataDatas setNextItem(java.util.List<ReadMessageContentResponseBodyDataDatasNextItem> nextItem) {
            this.nextItem = nextItem;
            return this;
        }
        public java.util.List<ReadMessageContentResponseBodyDataDatasNextItem> getNextItem() {
            return this.nextItem;
        }

    }

    public static class ReadMessageContentResponseBodyData extends TeaModel {
        @NameInMap("Datas")
        public ReadMessageContentResponseBodyDataDatas datas;

        public static ReadMessageContentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ReadMessageContentResponseBodyData self = new ReadMessageContentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ReadMessageContentResponseBodyData setDatas(ReadMessageContentResponseBodyDataDatas datas) {
            this.datas = datas;
            return this;
        }
        public ReadMessageContentResponseBodyDataDatas getDatas() {
            return this.datas;
        }

    }

}
