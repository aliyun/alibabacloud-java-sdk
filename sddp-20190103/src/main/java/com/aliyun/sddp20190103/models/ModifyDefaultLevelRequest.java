// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class ModifyDefaultLevelRequest extends TeaModel {
    /**
     * <p>The default sensitivity level of data that Data Security Center (DSC) cannot classify as sensitive or insensitive. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: N/A</li>
     * <li><strong>2</strong>: S1</li>
     * <li><strong>3</strong>: S2</li>
     * <li><strong>4</strong>: S3</li>
     * <li><strong>5</strong>: S4</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("DefaultId")
    public Long defaultId;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh_cn</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh_cn</strong>: Chinese</li>
     * <li><strong>en_us</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh_cn</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The sensitivity level ID of data that DSC classifies as sensitive. Separate multiple IDs with commas (,). Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: N/A</li>
     * <li><strong>2</strong>: S1</li>
     * <li><strong>3</strong>: S2</li>
     * <li><strong>4</strong>: S3</li>
     * <li><strong>5</strong>: S4</li>
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
