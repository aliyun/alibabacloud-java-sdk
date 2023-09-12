// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAgentlessMaliciousFilesResponseBody extends TeaModel {
    /**
     * <p>The malicious files.</p>
     */
    @NameInMap("List")
    public java.util.List<ListAgentlessMaliciousFilesResponseBodyList> list;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public ListAgentlessMaliciousFilesResponseBodyPageInfo pageInfo;

    /**
     * <p>The request ID.</p>
     */
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
        /**
         * <p>The name of the exception.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The name key of the exception.</p>
         */
        @NameInMap("NameKey")
        public String nameKey;

        /**
         * <p>The type of the exception.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The value of the exception.</p>
         */
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
        /**
         * <p>The remark.</p>
         */
        @NameInMap("Note")
        public String note;

        /**
         * <p>The ID of the remark.</p>
         */
        @NameInMap("NoteId")
        public String noteId;

        /**
         * <p>The time when the remark was created.</p>
         */
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
        /**
         * <p>The details of the exception.</p>
         */
        @NameInMap("Details")
        public java.util.List<ListAgentlessMaliciousFilesResponseBodyListDetails> details;

        /**
         * <p>The URL to download the malicious image sample.</p>
         */
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        /**
         * <p>The file path.</p>
         */
        @NameInMap("FilePath")
        public Long filePath;

        /**
         * <p>The timestamp generated when the first scan was performed. Unit: milliseconds.</p>
         */
        @NameInMap("FirstScanTimestamp")
        public Long firstScanTimestamp;

        /**
         * <p>The highlighted JSON string.</p>
         */
        @NameInMap("HighLight")
        public String highLight;

        /**
         * <p>The event ID.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the asset.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The public IP address of the server.</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The private IP address of the server.</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The timestamp generated when the last scan was performed. Unit: milliseconds.</p>
         */
        @NameInMap("LatestScanTimestamp")
        public Long latestScanTimestamp;

        /**
         * <p>The severity of the malicious file. Valid values:</p>
         * <br>
         * <p>*   serious</p>
         * <p>*   suspicious</p>
         * <p>*   remind</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The MD5 hash value of the malicious file.</p>
         */
        @NameInMap("MaliciousMd5")
        public String maliciousMd5;

        /**
         * <p>The name of the malicious file.</p>
         */
        @NameInMap("MaliciousName")
        public String maliciousName;

        @NameInMap("MaliciousType")
        public String maliciousType;

        /**
         * <p>The remarks.</p>
         */
        @NameInMap("Notes")
        public java.util.List<ListAgentlessMaliciousFilesResponseBodyListNotes> notes;

        /**
         * <p>The handling result of the exception.</p>
         */
        @NameInMap("OperateResult")
        public String operateResult;

        /**
         * <p>The timestamp generated when the exception is handled. Unit: milliseconds.</p>
         */
        @NameInMap("OperateTimestamp")
        public String operateTimestamp;

        /**
         * <p>The partition of the disk.</p>
         */
        @NameInMap("Partition")
        public String partition;

        /**
         * <p>The ID of the asset that is scanned.</p>
         */
        @NameInMap("TargetId")
        public String targetId;

        /**
         * <p>The name of the asset that is scanned.</p>
         */
        @NameInMap("TargetName")
        public String targetName;

        /**
         * <p>The type of the asset that is scanned. Valid values:</p>
         * <br>
         * <p>*   2: The scanned asset is an image.</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        /**
         * <p>The UUID of the asset.</p>
         */
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

        public ListAgentlessMaliciousFilesResponseBodyList setMaliciousType(String maliciousType) {
            this.maliciousType = maliciousType;
            return this;
        }
        public String getMaliciousType() {
            return this.maliciousType;
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
        /**
         * <p>The number of entries returned on the current page.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         */
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
