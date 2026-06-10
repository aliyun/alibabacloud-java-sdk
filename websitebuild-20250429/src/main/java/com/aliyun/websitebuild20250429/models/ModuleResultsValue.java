// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ModuleResultsValue extends TeaModel {
    /**
     * <p>Whether the check is passed</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Passed")
    public Boolean passed;

    /**
     * <p>Resource identity</p>
     * 
     * <strong>example:</strong>
     * <p>InspirationTokens</p>
     */
    @NameInMap("ResourceCode")
    public String resourceCode;

    /**
     * <p>Error code when failed; null when passed</p>
     * 
     * <strong>example:</strong>
     * <p>Resource.Control.No.Usage</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>Error message when failed; null when passed</p>
     * 
     * <strong>example:</strong>
     * <p>用量耗尽</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    public static ModuleResultsValue build(java.util.Map<String, ?> map) throws Exception {
        ModuleResultsValue self = new ModuleResultsValue();
        return TeaModel.build(map, self);
    }

    public ModuleResultsValue setPassed(Boolean passed) {
        this.passed = passed;
        return this;
    }
    public Boolean getPassed() {
        return this.passed;
    }

    public ModuleResultsValue setResourceCode(String resourceCode) {
        this.resourceCode = resourceCode;
        return this;
    }
    public String getResourceCode() {
        return this.resourceCode;
    }

    public ModuleResultsValue setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ModuleResultsValue setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

}
