// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetAlertDestinationResponseBody extends TeaModel {
    /**
     * <p>Status code.  </p>
     * <ul>
     * <li>If <code>code == Success</code>, authorization succeeded.  </li>
     * <li>Other status codes indicate authorization failed. When authorization fails, check the <code>message</code> field for detailed error information.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success or Sysom.ServerError</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Returned data.</p>
     */
    @NameInMap("data")
    public GetAlertDestinationResponseBodyData data;

    /**
     * <p>Error message.  </p>
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
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2D693121-C925-5154-8DF6-C09A8B369822</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetAlertDestinationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAlertDestinationResponseBody self = new GetAlertDestinationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAlertDestinationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAlertDestinationResponseBody setData(GetAlertDestinationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAlertDestinationResponseBodyData getData() {
        return this.data;
    }

    public GetAlertDestinationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAlertDestinationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAlertDestinationResponseBodyData extends TeaModel {
        /**
         * <p>Creation Time.</p>
         * 
         * <strong>example:</strong>
         * <p>1751520976660</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>Alert contact ID</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("id")
        public Integer id;

        /**
         * <p>Alert contact name</p>
         * 
         * <strong>example:</strong>
         * <p>name1</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Configuration Parameter</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;webhook&quot;:&quot;&quot;,
         *     &quot;sec&quot;:&quot;&quot;,
         * }</p>
         */
        @NameInMap("params")
        public Object params;

        /**
         * <p>Configuration source</p>
         * 
         * <strong>example:</strong>
         * <p>console</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <p>Alert push target. Currently, only DingTalk Robot is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>dingtalk</p>
         */
        @NameInMap("target")
        public String target;

        /**
         * <p>User ID</p>
         * 
         * <strong>example:</strong>
         * <p>1234123412352311</p>
         */
        @NameInMap("uid")
        public String uid;

        /**
         * <p>Update Time.</p>
         * 
         * <strong>example:</strong>
         * <p>1751254826285</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        public static GetAlertDestinationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAlertDestinationResponseBodyData self = new GetAlertDestinationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAlertDestinationResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetAlertDestinationResponseBodyData setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public GetAlertDestinationResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAlertDestinationResponseBodyData setParams(Object params) {
            this.params = params;
            return this;
        }
        public Object getParams() {
            return this.params;
        }

        public GetAlertDestinationResponseBodyData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetAlertDestinationResponseBodyData setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public GetAlertDestinationResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public GetAlertDestinationResponseBodyData setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

    }

}
