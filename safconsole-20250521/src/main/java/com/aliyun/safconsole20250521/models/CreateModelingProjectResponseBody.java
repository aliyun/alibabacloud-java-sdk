// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class CreateModelingProjectResponseBody extends TeaModel {
    /**
     * <p>Status code. A return value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4A91D2D1-AEC9-1658-ABCE-5A39DE66A5C2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Return result.</p>
     */
    @NameInMap("ResultObject")
    public CreateModelingProjectResponseBodyResultObject resultObject;

    /**
     * <p>Whether the call was successful.</p>
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

    public static CreateModelingProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateModelingProjectResponseBody self = new CreateModelingProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateModelingProjectResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public CreateModelingProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateModelingProjectResponseBody setResultObject(CreateModelingProjectResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public CreateModelingProjectResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public CreateModelingProjectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateModelingProjectResponseBodyResultObject extends TeaModel {
        /**
         * <p>Project ID</p>
         * 
         * <strong>example:</strong>
         * <p>01</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        public static CreateModelingProjectResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            CreateModelingProjectResponseBodyResultObject self = new CreateModelingProjectResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public CreateModelingProjectResponseBodyResultObject setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

    }

}
