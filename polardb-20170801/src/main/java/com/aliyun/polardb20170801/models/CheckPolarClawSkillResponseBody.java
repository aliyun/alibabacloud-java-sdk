// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CheckPolarClawSkillResponseBody extends TeaModel {
    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public java.util.List<String> message;

    /**
     * <p>The name of the OSS bucket where the skill files are stored.</p>
     * 
     * <strong>example:</strong>
     * <p>oss-bucket-test</p>
     */
    @NameInMap("OSSBucket")
    public String OSSBucket;

    /**
     * <p>The region ID of the OSS bucket where the skill files are stored.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("OSSRegionId")
    public String OSSRegionId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EBEAA83D-1734-42E3-85E3-E25F6E******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The request result. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The request succeeded.</p>
     * </li>
     * <li><p><strong>false</strong>: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CheckPolarClawSkillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckPolarClawSkillResponseBody self = new CheckPolarClawSkillResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckPolarClawSkillResponseBody setMessage(java.util.List<String> message) {
        this.message = message;
        return this;
    }
    public java.util.List<String> getMessage() {
        return this.message;
    }

    public CheckPolarClawSkillResponseBody setOSSBucket(String OSSBucket) {
        this.OSSBucket = OSSBucket;
        return this;
    }
    public String getOSSBucket() {
        return this.OSSBucket;
    }

    public CheckPolarClawSkillResponseBody setOSSRegionId(String OSSRegionId) {
        this.OSSRegionId = OSSRegionId;
        return this;
    }
    public String getOSSRegionId() {
        return this.OSSRegionId;
    }

    public CheckPolarClawSkillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckPolarClawSkillResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
