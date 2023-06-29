// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class ModifyDefaultLevelRequest extends TeaModel {
    /**
     * <p>The default sensitivity level of data that Data Security Center (DSC) cannot classify as sensitive or insensitive. Valid values:</p>
     * <br>
     * <p>*   **1**: N/A</p>
     * <p>*   **2**: S1</p>
     * <p>*   **3**: S2</p>
     * <p>*   **4**: S3</p>
     * <p>*   **5**: S4</p>
     */
    @NameInMap("DefaultId")
    public Long defaultId;

    /**
     * <p>The language of the content within the request and response. Default value: **zh_cn**. Valid values:</p>
     * <br>
     * <p>*   **zh_cn**: Chinese</p>
     * <p>*   **en_us**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The sensitivity level ID of data that DSC classifies as sensitive. Separate multiple IDs with commas (,). Valid values:</p>
     * <br>
     * <p>*   **1**: N/A</p>
     * <p>*   **2**: S1</p>
     * <p>*   **3**: S2</p>
     * <p>*   **4**: S3</p>
     * <p>*   **5**: S4</p>
     */
    @NameInMap("SensitiveIds")
    public String sensitiveIds;

    public static ModifyDefaultLevelRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDefaultLevelRequest self = new ModifyDefaultLevelRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDefaultLevelRequest setDefaultId(Long defaultId) {
        this.defaultId = defaultId;
        return this;
    }
    public Long getDefaultId() {
        return this.defaultId;
    }

    public ModifyDefaultLevelRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyDefaultLevelRequest setSensitiveIds(String sensitiveIds) {
        this.sensitiveIds = sensitiveIds;
        return this;
    }
    public String getSensitiveIds() {
        return this.sensitiveIds;
    }

}
