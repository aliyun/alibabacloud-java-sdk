// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateSasOrderRequest extends TeaModel {
    @NameInMap("AutoPay")
    public Boolean autoPay;

    @NameInMap("AutoRenewPeriod")
    public Integer autoRenewPeriod;

    @NameInMap("AutoUseCoupon")
    public Boolean autoUseCoupon;

    @NameInMap("ContainerImageScan")
    public String containerImageScan;

    @NameInMap("InstanceCount")
    public String instanceCount;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("PeriodUnit")
    public String periodUnit;

    @NameInMap("SasAntiRansomware")
    public String sasAntiRansomware;

    @NameInMap("SasProductService")
    public String sasProductService;

    @NameInMap("SasSc")
    public String sasSc;

    @NameInMap("SasSlsStorage")
    public String sasSlsStorage;

    @NameInMap("SasWebguardBoolean")
    public String sasWebguardBoolean;

    @NameInMap("SasWebguardOrderNum")
    public String sasWebguardOrderNum;

    @NameInMap("Spec")
    public String spec;

    @NameInMap("Vcore")
    public String vcore;

    public static CreateSasOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSasOrderRequest self = new CreateSasOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateSasOrderRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateSasOrderRequest setAutoRenewPeriod(Integer autoRenewPeriod) {
        this.autoRenewPeriod = autoRenewPeriod;
        return this;
    }
    public Integer getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    public CreateSasOrderRequest setAutoUseCoupon(Boolean autoUseCoupon) {
        this.autoUseCoupon = autoUseCoupon;
        return this;
    }
    public Boolean getAutoUseCoupon() {
        return this.autoUseCoupon;
    }

    public CreateSasOrderRequest setContainerImageScan(String containerImageScan) {
        this.containerImageScan = containerImageScan;
        return this;
    }
    public String getContainerImageScan() {
        return this.containerImageScan;
    }

    public CreateSasOrderRequest setInstanceCount(String instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }
    public String getInstanceCount() {
        return this.instanceCount;
    }

    public CreateSasOrderRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateSasOrderRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public CreateSasOrderRequest setSasAntiRansomware(String sasAntiRansomware) {
        this.sasAntiRansomware = sasAntiRansomware;
        return this;
    }
    public String getSasAntiRansomware() {
        return this.sasAntiRansomware;
    }

    public CreateSasOrderRequest setSasProductService(String sasProductService) {
        this.sasProductService = sasProductService;
        return this;
    }
    public String getSasProductService() {
        return this.sasProductService;
    }

    public CreateSasOrderRequest setSasSc(String sasSc) {
        this.sasSc = sasSc;
        return this;
    }
    public String getSasSc() {
        return this.sasSc;
    }

    public CreateSasOrderRequest setSasSlsStorage(String sasSlsStorage) {
        this.sasSlsStorage = sasSlsStorage;
        return this;
    }
    public String getSasSlsStorage() {
        return this.sasSlsStorage;
    }

    public CreateSasOrderRequest setSasWebguardBoolean(String sasWebguardBoolean) {
        this.sasWebguardBoolean = sasWebguardBoolean;
        return this;
    }
    public String getSasWebguardBoolean() {
        return this.sasWebguardBoolean;
    }

    public CreateSasOrderRequest setSasWebguardOrderNum(String sasWebguardOrderNum) {
        this.sasWebguardOrderNum = sasWebguardOrderNum;
        return this;
    }
    public String getSasWebguardOrderNum() {
        return this.sasWebguardOrderNum;
    }

    public CreateSasOrderRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

    public CreateSasOrderRequest setVcore(String vcore) {
        this.vcore = vcore;
        return this;
    }
    public String getVcore() {
        return this.vcore;
    }

}
