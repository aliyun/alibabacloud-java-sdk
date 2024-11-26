// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeApiExportsResponseBody extends TeaModel {
    /**
     * <p>The returned data export tasks.</p>
     */
    @NameInMap("ApiExports")
    public java.util.List<DescribeApiExportsResponseBodyApiExports> apiExports;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D9532525-E885-54E7-A178-D5554D563AFB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the data export task. Valid values:</p>
     * <ul>
     * <li><strong>expired</strong>: The file is expired.</li>
     * <li><strong>exporting</strong>: Data is being exported.</li>
     * <li><strong>completed</strong>: Data is exported.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("Total")
    public Long total;

    public static DescribeApiExportsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiExportsResponseBody self = new DescribeApiExportsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApiExportsResponseBody setApiExports(java.util.List<DescribeApiExportsResponseBodyApiExports> apiExports) {
        this.apiExports = apiExports;
        return this;
    }
    public java.util.List<DescribeApiExportsResponseBodyApiExports> getApiExports() {
        return this.apiExports;
    }

    public DescribeApiExportsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApiExportsResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class DescribeApiExportsResponseBodyApiExports extends TeaModel {
        /**
         * <p>The time when the data export task was created. The value is a UNIX timestamp displayed in UTC. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1725604852</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The name of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>file_16109541456445334c0f01d9a7444e0e908***.csv</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The download URL of the exported file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://waf-api-sec-cn.***.aliyuncs.com/file_1610954145***.csv">https://waf-api-sec-cn.***.aliyuncs.com/file_1610954145***.csv</a></p>
         */
        @NameInMap("FileUrl")
        public String fileUrl;

        /**
         * <p>The format of the exported file.</p>
         * 
         * <strong>example:</strong>
         * <p>CSV</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The status of the data export task. Valid values:</p>
         * <ul>
         * <li><p><strong>expired</strong>: The file is expired.</p>
         * </li>
         * <li><p><strong>exporting</strong>: Data is being exported.</p>
         * </li>
         * <li><p><strong>completed</strong>: Data is exported.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>completed</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type of the data export task. Valid values:</p>
         * <ul>
         * <li><p><strong>apisec_api</strong>: API tasks</p>
         * </li>
         * <li><p><strong>apisec_abnormal</strong>: API risk tasks</p>
         * </li>
         * <li><p><strong>apisec_event</strong>: API security event tasks</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>apisec_api</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeApiExportsResponseBodyApiExports build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiExportsResponseBodyApiExports self = new DescribeApiExportsResponseBodyApiExports();
            return TeaModel.build(map, self);
        }

        public DescribeApiExportsResponseBodyApiExports setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeApiExportsResponseBodyApiExports setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public DescribeApiExportsResponseBodyApiExports setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public DescribeApiExportsResponseBodyApiExports setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public DescribeApiExportsResponseBodyApiExports setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeApiExportsResponseBodyApiExports setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
