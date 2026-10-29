// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeComfyUserDatasResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Total")
    public Integer total;

    /**
     * <p>The list of user data.</p>
     */
    @NameInMap("UserDatas")
    public java.util.List<DescribeComfyUserDatasResponseBodyUserDatas> userDatas;

    public static DescribeComfyUserDatasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeComfyUserDatasResponseBody self = new DescribeComfyUserDatasResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeComfyUserDatasResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public DescribeComfyUserDatasResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeComfyUserDatasResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeComfyUserDatasResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeComfyUserDatasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeComfyUserDatasResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public DescribeComfyUserDatasResponseBody setUserDatas(java.util.List<DescribeComfyUserDatasResponseBodyUserDatas> userDatas) {
        this.userDatas = userDatas;
        return this;
    }
    public java.util.List<DescribeComfyUserDatasResponseBodyUserDatas> getUserDatas() {
        return this.userDatas;
    }

    public static class DescribeComfyUserDatasResponseBodyUserDatas extends TeaModel {
        /**
         * <p>The name of the file or directory.</p>
         * 
         * <strong>example:</strong>
         * <p>myfile</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The file size in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("FileSize")
        public Long fileSize;

        /**
         * <p>The file type. Valid values: file and dir.</p>
         * 
         * <strong>example:</strong>
         * <p>file</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The last modified time. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1776646928000</p>
         */
        @NameInMap("UpdatedTime")
        public String updatedTime;

        public static DescribeComfyUserDatasResponseBodyUserDatas build(java.util.Map<String, ?> map) throws Exception {
            DescribeComfyUserDatasResponseBodyUserDatas self = new DescribeComfyUserDatasResponseBodyUserDatas();
            return TeaModel.build(map, self);
        }

        public DescribeComfyUserDatasResponseBodyUserDatas setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public DescribeComfyUserDatasResponseBodyUserDatas setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public DescribeComfyUserDatasResponseBodyUserDatas setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeComfyUserDatasResponseBodyUserDatas setUpdatedTime(String updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public String getUpdatedTime() {
            return this.updatedTime;
        }

    }

}
