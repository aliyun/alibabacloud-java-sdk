// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAgentlessMaliciousFilesResponseBody extends TeaModel {
    @NameInMap("List")
    public java.util.List<ListAgentlessMaliciousFilesResponseBodyList> list;

    @NameInMap("PageInfo")
    public ListAgentlessMaliciousFilesResponseBodyPageInfo pageInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static ListAgentlessMaliciousFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAgentlessMaliciousFilesResponseBody self = new ListAgentlessMaliciousFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAgentlessMaliciousFilesResponseBody setList(java.util.List<ListAgentlessMaliciousFilesResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ListAgentlessMaliciousFilesResponseBodyList> getList() {
        return this.list;
    }

    public ListAgentlessMaliciousFilesResponseBody setPageInfo(ListAgentlessMaliciousFilesResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListAgentlessMaliciousFilesResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListAgentlessMaliciousFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAgentlessMaliciousFilesResponseBodyListDetails extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("NameKey")
        public String nameKey;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static ListAgentlessMaliciousFilesResponseBodyListDetails build(java.util.Map<String, ?> map) throws Exception {
            ListAgentlessMaliciousFilesResponseBodyListDetails self = new ListAgentlessMaliciousFilesResponseBodyListDetails();
            return TeaModel.build(map, self);
        }

        public ListAgentlessMaliciousFilesResponseBodyListDetails setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAgentlessMaliciousFilesResponseBodyListDetails setNameKey(String nameKey) {
            this.nameKey = nameKey;
            return this;
        }
        public String getNameKey() {
            return this.nameKey;
        }

        public ListAgentlessMaliciousFilesResponseBodyListDetails setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListAgentlessMaliciousFilesResponseBodyListDetails setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListAgentlessMaliciousFilesResponseBodyListNotes extends TeaModel {
        @NameInMap("Note")
        public String note;

        @NameInMap("NoteId")
        public String noteId;

        @NameInMap("NoteTime")
        public String noteTime;

        public static ListAgentlessMaliciousFilesResponseBodyListNotes build(java.util.Map<String, ?> map) throws Exception {
            ListAgentlessMaliciousFilesResponseBodyListNotes self = new ListAgentlessMaliciousFilesResponseBodyListNotes();
            return TeaModel.build(map, self);
        }

        public ListAgentlessMaliciousFilesResponseBodyListNotes setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public ListAgentlessMaliciousFilesResponseBodyListNotes setNoteId(String noteId) {
            this.noteId = noteId;
            return this;
        }
        public String getNoteId() {
            return this.noteId;
        }

        public ListAgentlessMaliciousFilesResponseBodyListNotes setNoteTime(String noteTime) {
            this.noteTime = noteTime;
            return this;
        }
        public String getNoteTime() {
            return this.noteTime;
        }

    }

    public static class ListAgentlessMaliciousFilesResponseBodyList extends TeaModel {
        @NameInMap("Details")
        public java.util.List<ListAgentlessMaliciousFilesResponseBodyListDetails> details;

        @NameInMap("DownloadUrl")
        public String downloadUrl;

        @NameInMap("FilePath")
        public Long filePath;

        @NameInMap("FirstScanTimestamp")
        public Long firstScanTimestamp;

        @NameInMap("HighLight")
        public String highLight;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InternetIp")
        public String internetIp;

        @NameInMap("IntranetIp")
        public String intranetIp;

        @NameInMap("LatestScanTimestamp")
        public Long latestScanTimestamp;

        @NameInMap("Level")
        public String level;

        @NameInMap("MaliciousMd5")
        public String maliciousMd5;

        @NameInMap("MaliciousName")
        public String maliciousName;

        @NameInMap("Notes")
        public java.util.List<ListAgentlessMaliciousFilesResponseBodyListNotes> notes;

        @NameInMap("OperateResult")
        public String operateResult;

        @NameInMap("OperateTimestamp")
        public String operateTimestamp;

        @NameInMap("Partition")
        public String partition;

        @NameInMap("TargetId")
        public String targetId;

        @NameInMap("TargetName")
        public String targetName;

        @NameInMap("TargetType")
        public String targetType;

        @NameInMap("Uuid")
        public String uuid;

        public static ListAgentlessMaliciousFilesResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            ListAgentlessMaliciousFilesResponseBodyList self = new ListAgentlessMaliciousFilesResponseBodyList();
            return TeaModel.build(map, self);
        }

        public ListAgentlessMaliciousFilesResponseBodyList setDetails(java.util.List<ListAgentlessMaliciousFilesResponseBodyListDetails> details) {
            this.details = details;
            return this;
        }
        public java.util.List<ListAgentlessMaliciousFilesResponseBodyListDetails> getDetails() {
            return this.details;
        }

        public ListAgentlessMaliciousFilesResponseBodyList setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public ListAgentlessMaliciousFilesResponseBodyList setFilePath(Long filePath) {
            this.filePath = filePath;
            return this;
        }
        public Long getFilePath() {
            return this.filePath;
        }

        public ListAgentlessMaliciousFilesResponseBodyList setFirstScanTimestamp(Long firstScanTimestamp) {
            this.firstScanTimestamp = firstScanTimestamp;
            return this;
        }
        public Long getFirstScanTimestamp() {
            return this.firstScanTimestamp;
        }

        public ListAgentlessMaliciousFilesResponseBodyList setHighLight(String highLight) {
            this.highLight = highLight;
            return this;
        }
        public String getHighLight() {
            return this.highLight;
        }

        public ListAgentlessMaliciousFilesResponseBodyList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListAgentlessMaliciousFilesResponseBodyList setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListAgentlessMaliciousFilesResponseBodyList setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public ListAgentlessMaliciousFilesResponseBodyList setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public ListAgentlessMaliciousFilesResponseBodyList setLatestScanTimestamp(Long latestScanTimestamp) {
            this.latestScanTimestamp = latestScanTimestamp;
            return this;
        }
        public Long getLatestScanTimestamp() {
            return this.latestScanTimestamp;
        }

        public ListAgentlessMaliciousFilesResponseBodyList setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ListAgentlessMaliciousFilesResponseBodyList setMaliciousMd5(String maliciousMd5) {
            this.maliciousMd5 = maliciousMd5;
            return this;
        }
        public String getMaliciousMd5() {
            return this.maliciousMd5;
        }

        public ListAgentlessMaliciousFilesResponseBodyList setMaliciousName(String maliciousName) {
            this.maliciousName = maliciousName;
            return this;
        }
        public String getMaliciousName() {
            return this.maliciousName;
        }

        public ListAgentlessMaliciousFilesResponseBodyList setNotes(java.util.List<ListAgentlessMaliciousFilesResponseBodyListNotes> notes) {
            this.notes = notes;
            return this;
        }
        public java.util.List<ListAgentlessMaliciousFilesResponseBodyListNotes> getNotes() {
            return this.notes;
        }

        public ListAgentlessMaliciousFilesResponseBodyList setOperateResult(String operateResult) {
            this.operateResult = operateResult;
            return this;
        }
        public String getOperateResult() {
            return this.operateResult;
        }

        public ListAgentlessMaliciousFilesResponseBodyList setOperateTimestamp(String operateTimestamp) {
            this.operateTimestamp = operateTimestamp;
            return this;
        }
        public String getOperateTimestamp() {
            return this.operateTimestamp;
        }

        public ListAgentlessMaliciousFilesResponseBodyList setPartition(String partition) {
            this.partition = partition;
            return this;
        }
        public String getPartition() {
            return this.partition;
        }

        public ListAgentlessMaliciousFilesResponseBodyList setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

        public ListAgentlessMaliciousFilesResponseBodyList setTargetName(String targetName) {
            this.targetName = targetName;
            return this;
        }
        public String getTargetName() {
            return this.targetName;
        }

        public ListAgentlessMaliciousFilesResponseBodyList setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public ListAgentlessMaliciousFilesResponseBodyList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class ListAgentlessMaliciousFilesResponseBodyPageInfo extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListAgentlessMaliciousFilesResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListAgentlessMaliciousFilesResponseBodyPageInfo self = new ListAgentlessMaliciousFilesResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListAgentlessMaliciousFilesResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListAgentlessMaliciousFilesResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListAgentlessMaliciousFilesResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListAgentlessMaliciousFilesResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
