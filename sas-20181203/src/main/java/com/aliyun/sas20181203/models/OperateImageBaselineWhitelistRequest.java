// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperateImageBaselineWhitelistRequest extends TeaModel {
    /**
     * <p>The keys of baseline check items.</p>
     */
    @NameInMap("BaselineItemKeyList")
    public String baselineItemKeyList;

    /**
     * <p>The UUID of the image.</p>
     */
    @NameInMap("ImageUuid")
    public String imageUuid;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The operation that you want to perform on the check items. Valid values:</p>
     * <br>
     * <p>*   **add**: adds the check items to the whitelist</p>
     * <p>*   **del**: removes the check items from the whitelist</p>
     */
    @NameInMap("Operation")
    public String operation;

    /**
     * <p>The types of the assets that you want to scan.</p>
     */
    @NameInMap("ScanRange")
    public java.util.List<String> scanRange;

    public static OperateImageBaselineWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateImageBaselineWhitelistRequest self = new OperateImageBaselineWhitelistRequest();
        return TeaModel.build(map, self);
    }

    public OperateImageBaselineWhitelistRequest setBaselineItemKeyList(String baselineItemKeyList) {
        this.baselineItemKeyList = baselineItemKeyList;
        return this;
    }
    public String getBaselineItemKeyList() {
        return this.baselineItemKeyList;
    }

    public OperateImageBaselineWhitelistRequest setImageUuid(String imageUuid) {
        this.imageUuid = imageUuid;
        return this;
    }
    public String getImageUuid() {
        return this.imageUuid;
    }

    public OperateImageBaselineWhitelistRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public OperateImageBaselineWhitelistRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public OperateImageBaselineWhitelistRequest setScanRange(java.util.List<String> scanRange) {
        this.scanRange = scanRange;
        return this;
    }
    public java.util.List<String> getScanRange() {
        return this.scanRange;
    }

}
