// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeInstanceRebootStatusResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the status information about the servers that you restart.</p>
     */
    @NameInMap("RebootStatuses")
    public java.util.List<DescribeInstanceRebootStatusResponseBodyRebootStatuses> rebootStatuses;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>5BD95679-D63A-4151-97D0-188432F4A57</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeInstanceRebootStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceRebootStatusResponseBody self = new DescribeInstanceRebootStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceRebootStatusResponseBody setRebootStatuses(java.util.List<DescribeInstanceRebootStatusResponseBodyRebootStatuses> rebootStatuses) {
        this.rebootStatuses = rebootStatuses;
        return this;
    }
    public java.util.List<DescribeInstanceRebootStatusResponseBodyRebootStatuses> getRebootStatuses() {
        return this.rebootStatuses;
    }

    public DescribeInstanceRebootStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceRebootStatusResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeInstanceRebootStatusResponseBodyRebootStatuses extends TeaModel {
        /**
         * <p>The error code that is returned when the server failed to be restarted. Valid values:</p>
         * <ul>
         * <li><strong>10001</strong>: The restart command failed to be sent.</li>
         * <li><strong>10002</strong>: The restart operation failed.</li>
         * <li><strong>10003</strong>: A timeout error occurs.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The message that is returned when the server failed to be restarted.</p>
         * 
         * <strong>example:</strong>
         * <p>push failed</p>
         */
        @NameInMap("Msg")
        public String msg;

        /**
         * <p>The status of the server. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The server is being restarted.</li>
         * <li><strong>1</strong>: The server is restarted.</li>
         * <li><strong>2</strong>: The server failed to be restarted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RebootStatus")
        public Integer rebootStatus;

        /**
         * <p>The UUID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>9b59c2d6-0967-46e3-ad7b-152227c****</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static DescribeInstanceRebootStatusResponseBodyRebootStatuses build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceRebootStatusResponseBodyRebootStatuses self = new DescribeInstanceRebootStatusResponseBodyRebootStatuses();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceRebootStatusResponseBodyRebootStatuses setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeInstanceRebootStatusResponseBodyRebootStatuses setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public DescribeInstanceRebootStatusResponseBodyRebootStatuses setRebootStatus(Integer rebootStatus) {
            this.rebootStatus = rebootStatus;
            return this;
        }
        public Integer getRebootStatus() {
            return this.rebootStatus;
        }

        public DescribeInstanceRebootStatusResponseBodyRebootStatuses setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
