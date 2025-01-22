// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCheckDetailRequest extends TeaModel {
    /**
     * <p>The ID of the check item.</p>
     * <blockquote>
     * <p> You can call the <a href="~~ListCheckResult~~">ListCheckResult</a> operation to query the IDs of check items.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("CheckId")
    public Long checkId;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The region ID of the instance.</p>
     * <blockquote>
     * <p> You can call the <a href="~~ListCloudAssetInstances~~">ListCloudAssetInstances</a> operation to query the region ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetCheckDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCheckDetailRequest self = new GetCheckDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetCheckDetailRequest setCheckId(Long checkId) {
        this.checkId = checkId;
        return this;
    }
    public Long getCheckId() {
        return this.checkId;
    }

    public GetCheckDetailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public GetCheckDetailRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
