// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class DescribeServiceAndSceneResponseBody extends TeaModel {
    /**
     * <p>Status code. A return value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4A91D2D1-AEC9-1658-ABCE-5A39DE66A5C2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returned result.</p>
     */
    @NameInMap("ResultObject")
    public DescribeServiceAndSceneResponseBodyResultObject resultObject;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <ul>
     * <li><strong>true</strong>: Call succeeded.</li>
     * <li><strong>false</strong>: Call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeServiceAndSceneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceAndSceneResponseBody self = new DescribeServiceAndSceneResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeServiceAndSceneResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public DescribeServiceAndSceneResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeServiceAndSceneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeServiceAndSceneResponseBody setResultObject(DescribeServiceAndSceneResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeServiceAndSceneResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public DescribeServiceAndSceneResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeServiceAndSceneResponseBodyResultObject extends TeaModel {
        /**
         * <p>Model corresponding scene.</p>
         * 
         * <strong>example:</strong>
         * <p>scene_A</p>
         */
        @NameInMap("Scene")
        public String scene;

        /**
         * <p>Model corresponding service.</p>
         * 
         * <strong>example:</strong>
         * <p>service_A</p>
         */
        @NameInMap("Service")
        public String service;

        public static DescribeServiceAndSceneResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceAndSceneResponseBodyResultObject self = new DescribeServiceAndSceneResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeServiceAndSceneResponseBodyResultObject setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public DescribeServiceAndSceneResponseBodyResultObject setService(String service) {
            this.service = service;
            return this;
        }
        public String getService() {
            return this.service;
        }

    }

}
