// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20210112.models;

import com.aliyun.tea.*;

public class UploadSampleApiRequest extends TeaModel {
    /**
     * <p>The data type of the sample</p>
     * <ul>
     * <li>Phone number: mobile</li>
     * <li>MD5 of phone number: mobileMd5</li>
     * <li>IP: ip</li>
     * <li>Unique device ID: umid</li>
     * <li>Account ID: accountId</li>
     * <li>IMEI: imei</li>
     * <li>MD5 of IMEI: imeiMd5</li>
     * <li>OAID: oaid</li>
     * <li>MD5 of OAID: oaidMd5</li>
     * <li>Android ID: androidId</li>
     * <li>MD5 of Android ID: androidIdMd5</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ip</p>
     */
    @NameInMap("DataType")
    public String dataType;

    /**
     * <p>Specific value of the sample, to be passed in JSON format. Do not exceed 1000 entries at a time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;123.124.125.126&quot;,&quot;123.124.125.127&quot;]</p>
     */
    @NameInMap("DataValue")
    public String dataValue;

    /**
     * <p>The type of the sample</p>
     * <ul>
     * <li><p>Blacklist: block</p>
     * </li>
     * <li><p>Whitelist: pass</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>block</p>
     */
    @NameInMap("SampleType")
    public String sampleType;

    /**
     * <p>List of effective services, separate multiple services with commas</p>
     * <ul>
     * <li>Basic/Enhanced Registration Risk Identification: account_abuse</li>
     * <li>Basic/Enhanced Marketing Risk Identification: coupon_abuse</li>
     * <li>Basic/Enhanced Login Risk Identification: account_takeover</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>account_abuse,coupon_abuse,account_takeover</p>
     */
    @NameInMap("Service")
    public String service;

    public static UploadSampleApiRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadSampleApiRequest self = new UploadSampleApiRequest();
        return TeaModel.build(map, self);
    }

    public UploadSampleApiRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public UploadSampleApiRequest setDataValue(String dataValue) {
        this.dataValue = dataValue;
        return this;
    }
    public String getDataValue() {
        return this.dataValue;
    }

    public UploadSampleApiRequest setSampleType(String sampleType) {
        this.sampleType = sampleType;
        return this;
    }
    public String getSampleType() {
        return this.sampleType;
    }

    public UploadSampleApiRequest setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

}
