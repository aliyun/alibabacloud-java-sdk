// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeFrontVulPatchListRequest extends TeaModel {
    /**
     * <p>The information about the Windows system vulnerability. The value is a JSON string that contains the following fields:</p>
     * <ul>
     * <li><strong>name</strong>: the name of the vulnerability.</li>
     * <li><strong>uuid</strong>: the UUID of the server on which the vulnerability is detected.</li>
     * <li><strong>tag</strong>: the tag that is added to the vulnerability. Set this field to <strong>system</strong>, which indicates Windows system vulnerabilities.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;:&quot;5000803&quot;,&quot;uuid&quot;:&quot;026c9296-1234-5678-b937-a7d81f05****&quot;,&quot;tag&quot;:&quot;system&quot;}]</p>
     */
    @NameInMap("Info")
    public String info;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The operation that you want to perform on the vulnerability. Set the value to <strong>vul_fix</strong>, which indicates vulnerability fixing.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vul_fix</p>
     */
    @NameInMap("OperateType")
    public String operateType;

    /**
     * <p>The type of the vulnerability. Set the value to <strong>sys</strong>, which indicates Windows system vulnerabilities.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sys</p>
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
