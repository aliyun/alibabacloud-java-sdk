// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class ModifyDefaultLevelRequest extends TeaModel {
    /**
     * <p>The ID of the default threat level for unidentified data. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: N/A.</p>
     * </li>
     * <li><p><strong>2</strong>: S1.</p>
     * </li>
     * <li><p><strong>3</strong>: S2.</p>
     * </li>
     * <li><p><strong>4</strong>: S3.</p>
     * </li>
     * <li><p><strong>5</strong>: S4.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("DefaultId")
    public Long defaultId;

    /**
     * <p>The language of the request and response. Default value: <strong>zh_cn</strong>. Valid values:</p>
     * <ul>
     * <li><p><strong>zh_cn</strong>: Chinese.</p>
     * </li>
     * <li><p><strong>en_us</strong>: English.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh_cn</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The IDs of the threat levels for data classified as sensitive. If you specify multiple IDs, separate them with commas. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: N/A.</p>
     * </li>
     * <li><p><strong>2</strong>: S1.</p>
     * </li>
     * <li><p><strong>3</strong>: S2.</p>
     * </li>
     * <li><p><strong>4</strong>: S3.</p>
     * </li>
     * <li><p><strong>5</strong>: S4.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1,2,3,4</p>
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
