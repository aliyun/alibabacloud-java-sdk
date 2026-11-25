// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ModuleResultsValue extends TeaModel {
    /**
     * <p>Returned only for APP_WORKSPACE. This parameter indicates the target total quantity for this check, which is the used quantity in the saved configuration plus the ResourceValue. If a compatible DesiredTotal is provided, this total quantity is used directly. The used quantity for issues is the sum of normal and word-of-mouth issues in the saved configuration, and the used quantity for competitors is the number of competitors. This parameter is empty for APP and USER checks.</p>
     * 
     * <strong>example:</strong>
     * <p>21</p>
     */
    @NameInMap("DesiredTotal")
    public Long desiredTotal;

    /**
     * <p>The error code when the check fails. This parameter is null when the check passes.</p>
     * 
     * <strong>example:</strong>
     * <p>Resource.Control.No.Usage</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message when the check fails. This parameter is null when the check passes.</p>
     * 
     * <strong>example:</strong>
     * <p>Quota exhausted</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>Returned only for APP_WORKSPACE quantity pre-checks. This parameter indicates the maximum number of issues or competitors allowed by the current commodity version, not the remaining quota. This parameter is empty for APP and USER checks or when the version benefits cannot be determined.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("Limit")
    public Long limit;

    /**
     * <p>Indicates whether the check passed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Passed")
    public Boolean passed;

    /**
     * <p>The resource identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>InspirationTokens</p>
     */
    @NameInMap("ResourceCode")
    public String resourceCode;

    /**
     * <p>Indicates whether a purchasable higher version exists that can accommodate the DesiredTotal. This parameter is true only when the capacity of the current version is insufficient and a higher version meets the requirements. Otherwise, this parameter is false. This parameter may be empty for APP and USER checks. This field does not indicate that an upgrade has been performed or an upgrade order has been created.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("UpgradeAvailable")
    public Boolean upgradeAvailable;

    public static ModuleResultsValue build(java.util.Map<String, ?> map) throws Exception {
        ModuleResultsValue self = new ModuleResultsValue();
        return TeaModel.build(map, self);
    }

    public ModuleResultsValue setDesiredTotal(Long desiredTotal) {
        this.desiredTotal = desiredTotal;
        return this;
    }
    public Long getDesiredTotal() {
        return this.desiredTotal;
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

    public ModuleResultsValue setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
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

    public ModuleResultsValue setUpgradeAvailable(Boolean upgradeAvailable) {
        this.upgradeAvailable = upgradeAvailable;
        return this;
    }
    public Boolean getUpgradeAvailable() {
        return this.upgradeAvailable;
    }

}
