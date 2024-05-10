// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeFrontVulPatchListRequest extends TeaModel {
    /**
     * <p>The information about the Windows system vulnerability. The value is a JSON string that contains the following fields:</p>
     * <br>
     * <p>*   **name**: the name of the vulnerability.</p>
     * <p>*   **uuid**: the UUID of the server on which the vulnerability is detected.</p>
     * <p>*   **tag**: the tag that is added to the vulnerability. Set this field to **system**, which indicates Windows system vulnerabilities.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Info")
    public String info;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The operation that you want to perform on the vulnerability. Set the value to **vul_fix**, which indicates vulnerability fixing.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OperateType")
    public String operateType;

    /**
     * <p>The type of the vulnerability. Set the value to **sys**, which indicates Windows system vulnerabilities.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribeFrontVulPatchListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFrontVulPatchListRequest self = new DescribeFrontVulPatchListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFrontVulPatchListRequest setInfo(String info) {
        this.info = info;
        return this;
    }
    public String getInfo() {
        return this.info;
    }

    public DescribeFrontVulPatchListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeFrontVulPatchListRequest setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

    public DescribeFrontVulPatchListRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
