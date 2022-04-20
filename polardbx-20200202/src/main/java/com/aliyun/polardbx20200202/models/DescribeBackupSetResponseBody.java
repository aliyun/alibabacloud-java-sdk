// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeBackupSetResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeBackupSetResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeBackupSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupSetResponseBody self = new DescribeBackupSetResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupSetResponseBody setData(java.util.List<DescribeBackupSetResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeBackupSetResponseBodyData> getData() {
        return this.data;
    }

    public DescribeBackupSetResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeBackupSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackupSetResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeBackupSetResponseBodyDataOSSList extends TeaModel {
        // OSS 文件名
        @NameInMap("BackupSetFile")
        public String backupSetFile;

        // 外网下载地址
        @NameInMap("DownloadLink")
        public String downloadLink;

        // 内网OSS 下载地址
        @NameInMap("IntranetDownloadLink")
        public String intranetDownloadLink;

        // 过期时间
        @NameInMap("LinkExpiredTime")
        public String linkExpiredTime;

        public static DescribeBackupSetResponseBodyDataOSSList build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupSetResponseBodyDataOSSList self = new DescribeBackupSetResponseBodyDataOSSList();
            return TeaModel.build(map, self);
        }

        public DescribeBackupSetResponseBodyDataOSSList setBackupSetFile(String backupSetFile) {
            this.backupSetFile = backupSetFile;
            return this;
        }
        public String getBackupSetFile() {
            return this.backupSetFile;
        }

        public DescribeBackupSetResponseBodyDataOSSList setDownloadLink(String downloadLink) {
            this.downloadLink = downloadLink;
            return this;
        }
        public String getDownloadLink() {
            return this.downloadLink;
        }

        public DescribeBackupSetResponseBodyDataOSSList setIntranetDownloadLink(String intranetDownloadLink) {
            this.intranetDownloadLink = intranetDownloadLink;
            return this;
        }
        public String getIntranetDownloadLink() {
            return this.intranetDownloadLink;
        }

        public DescribeBackupSetResponseBodyDataOSSList setLinkExpiredTime(String linkExpiredTime) {
            this.linkExpiredTime = linkExpiredTime;
            return this;
        }
        public String getLinkExpiredTime() {
            return this.linkExpiredTime;
        }

    }

    public static class DescribeBackupSetResponseBodyData extends TeaModel {
        // 备份模式
        @NameInMap("BackupModel")
        public Integer backupModel;

        // 备份集ID
        @NameInMap("BackupSetId")
        public Long backupSetId;

        // 备份集大小
        @NameInMap("BackupSetSize")
        public Long backupSetSize;

        // 备份类型
        @NameInMap("BackupType")
        public Integer backupType;

        // 备份开始时间
        @NameInMap("BeginTime")
        public Long beginTime;

        // 备份结束时间
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("OSSList")
        public java.util.List<DescribeBackupSetResponseBodyDataOSSList> OSSList;

        // 状态
        @NameInMap("Status")
        public Integer status;

        public static DescribeBackupSetResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupSetResponseBodyData self = new DescribeBackupSetResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeBackupSetResponseBodyData setBackupModel(Integer backupModel) {
            this.backupModel = backupModel;
            return this;
        }
        public Integer getBackupModel() {
            return this.backupModel;
        }

        public DescribeBackupSetResponseBodyData setBackupSetId(Long backupSetId) {
            this.backupSetId = backupSetId;
            return this;
        }
        public Long getBackupSetId() {
            return this.backupSetId;
        }

        public DescribeBackupSetResponseBodyData setBackupSetSize(Long backupSetSize) {
            this.backupSetSize = backupSetSize;
            return this;
        }
        public Long getBackupSetSize() {
            return this.backupSetSize;
        }

        public DescribeBackupSetResponseBodyData setBackupType(Integer backupType) {
            this.backupType = backupType;
            return this;
        }
        public Integer getBackupType() {
            return this.backupType;
        }

        public DescribeBackupSetResponseBodyData setBeginTime(Long beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public Long getBeginTime() {
            return this.beginTime;
        }

        public DescribeBackupSetResponseBodyData setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeBackupSetResponseBodyData setOSSList(java.util.List<DescribeBackupSetResponseBodyDataOSSList> OSSList) {
            this.OSSList = OSSList;
            return this;
        }
        public java.util.List<DescribeBackupSetResponseBodyDataOSSList> getOSSList() {
            return this.OSSList;
        }

        public DescribeBackupSetResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
