// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.superappnlp20240930.models;

import com.aliyun.tea.*;

public class NlpAddressNormalizationRequest extends TeaModel {
    @NameInMap("CityStdManual")
    public String cityStdManual;

    /**
     * <strong>example:</strong>
     * <p>BACOLOR</p>
     */
    @NameInMap("CityStr")
    public String cityStr;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DistrictStdManual")
    public String districtStdManual;

    /**
     * <strong>example:</strong>
     * <p>10671</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ProvinceStdManual")
    public String provinceStdManual;

    /**
     * <strong>example:</strong>
     * <p>PAMPANGA</p>
     */
    @NameInMap("ProvinceStr")
    public String provinceStr;

    /**
     * <strong>example:</strong>
     * <p>350 Magliman, Bacolor, Pampanga AQUA MALTA Refilling Station</p>
     */
    @NameInMap("QueryStr")
    public String queryStr;

    public static NlpAddressNormalizationRequest build(java.util.Map<String, ?> map) throws Exception {
        NlpAddressNormalizationRequest self = new NlpAddressNormalizationRequest();
        return TeaModel.build(map, self);
    }

    public NlpAddressNormalizationRequest setCityStdManual(String cityStdManual) {
        this.cityStdManual = cityStdManual;
        return this;
    }
    public String getCityStdManual() {
        return this.cityStdManual;
    }

    public NlpAddressNormalizationRequest setCityStr(String cityStr) {
        this.cityStr = cityStr;
        return this;
    }
    public String getCityStr() {
        return this.cityStr;
    }

    public NlpAddressNormalizationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public NlpAddressNormalizationRequest setDistrictStdManual(String districtStdManual) {
        this.districtStdManual = districtStdManual;
        return this;
    }
    public String getDistrictStdManual() {
        return this.districtStdManual;
    }

    public NlpAddressNormalizationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public NlpAddressNormalizationRequest setProvinceStdManual(String provinceStdManual) {
        this.provinceStdManual = provinceStdManual;
        return this;
    }
    public String getProvinceStdManual() {
        return this.provinceStdManual;
    }

    public NlpAddressNormalizationRequest setProvinceStr(String provinceStr) {
        this.provinceStr = provinceStr;
        return this;
    }
    public String getProvinceStr() {
        return this.provinceStr;
    }

    public NlpAddressNormalizationRequest setQueryStr(String queryStr) {
        this.queryStr = queryStr;
        return this;
    }
    public String getQueryStr() {
        return this.queryStr;
    }

}
