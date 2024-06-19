// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeBackupSetResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeBackupSetResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>successs</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1A6D328C-84B8-40DC-BF49-6C73984D7494</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>hins3084_data_20220418110623_qp.xb</p>
         */
        @NameInMap("BackupSetFile")
        public String backupSetFile;

        /**
         * <strong>example:</strong>
         * <p><a href="https://pre-rdsbak-cn-xxx.oss-cn-beijing.aliyuncs.com/custins2255/hins3084_data_20220418110623_qp.xb?OSSAccessKeyId=LTAI5tJEmRFdJ8aBPDR7****&Expires=1650441697&dd=7KJzkUSbXf6dwy">https://pre-rdsbak-cn-xxx.oss-cn-beijing.aliyuncs.com/custins2255/hins3084_data_20220418110623_qp.xb?OSSAccessKeyId=LTAI5tJEmRFdJ8aBPDR7****&amp;Expires=1650441697&amp;dd=7KJzkUSbXf6dwy</a></p>
         */
        @NameInMap("DownloadLink")
        public String downloadLink;

        /**
         * <strong>example:</strong>
         * <p><a href="http://pre-rdsbak-cn-beijing.oss-cn-beijing-internal.aliyuncs.com/custins2255/hins3084_data_20220418110623_qp.xb">http://pre-rdsbak-cn-beijing.oss-cn-beijing-internal.aliyuncs.com/custins2255/hins3084_data_20220418110623_qp.xb</a>?</p>
         */
        @NameInMap("IntranetDownloadLink")
        public String intranetDownloadLink;

        /**
         * <strong>example:</strong>
         * <p>2022-04-20T08:01:37Z</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BackupModel")
        public Integer backupModel;

        /**
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("BackupSetId")
        public Long backupSetId;

        /**
         * <strong>example:</strong>
         * <p>88803195</p>
         */
        @NameInMap("BackupSetSize")
        public Long backupSetSize;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BackupType")
        public Integer backupType;

        /**
         * <strong>example:</strong>
         * <p>1650250861754</p>
         */
        @NameInMap("BeginTime")
        public Long beginTime;

        /**
         * <strong>example:</strong>
         * <p>1650251308000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("OSSList")
        public java.util.List<DescribeBackupSetResponseBodyDataOSSList> OSSList;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
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
