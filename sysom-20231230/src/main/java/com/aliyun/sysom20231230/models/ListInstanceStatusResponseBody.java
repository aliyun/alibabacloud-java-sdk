// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class ListInstanceStatusResponseBody extends TeaModel {
    /**
     * <p>Request ID, which can be used for end-to-end diagnosis</p>
     * 
     * <strong>example:</strong>
     * <p>5BC79EF5-798B-5499-9683-4E14EBBBF712</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Status code  </p>
     * <ul>
     * <li>If <code>code == Success</code>, authorization succeeded.  </li>
     * <li>Other status codes indicate authorization failed. When authorization fails, check the <code>message</code> field for detailed error message.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Returned data</p>
     */
    @NameInMap("data")
    public java.util.List<ListInstanceStatusResponseBodyData> data;

    /**
     * <p>Error message  </p>
     * <ul>
     * <li>If <code>code == Success</code>, this field is empty.  </li>
     * <li>Otherwise, this field contains the request error message.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SysomOpenAPIAssumeRoleException: EntityNotExist.Role The role not exists: acs:ram::xxxxx:role/aliyunserviceroleforsysom</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Total number of records</p>
     * 
     * <strong>example:</strong>
     * <p>218</p>
     */
    @NameInMap("total")
    public Long total;

    public static ListInstanceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceStatusResponseBody self = new ListInstanceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstanceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstanceStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListInstanceStatusResponseBody setData(java.util.List<ListInstanceStatusResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListInstanceStatusResponseBodyData> getData() {
        return this.data;
    }

    public ListInstanceStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListInstanceStatusResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListInstanceStatusResponseBodyData extends TeaModel {
        /**
         * <p>Instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-wz9d00ut2ska3mlyhn6j</p>
         */
        @NameInMap("instance")
        public String instance;

        /**
         * <p>Region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("region")
        public String region;

        /**
         * <p>Instance running status. Valid values:  </p>
         * <ul>
         * <li><strong>Running</strong>: Running  </li>
         * <li><strong>Offline</strong>: Offline</li>
         * </ul>
         * <blockquote>
         * <p>An instance in the Offline state indicates that the heartbeat from the edge zone to the SysOM server is lost. This does not mean that the corresponding ECS instance is not running.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("status")
        public String status;

        public static ListInstanceStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceStatusResponseBodyData self = new ListInstanceStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListInstanceStatusResponseBodyData setInstance(String instance) {
            this.instance = instance;
            return this;
        }
        public String getInstance() {
            return this.instance;
        }

        public ListInstanceStatusResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListInstanceStatusResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
