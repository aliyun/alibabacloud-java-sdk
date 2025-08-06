// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DataBusinessesValue extends TeaModel {
    @NameInMap("Id")
    public Integer id;

    @NameInMap("Name")
    public String name;

    @NameInMap("Cname")
    public String cname;

    @NameInMap("Sname")
    public String sname;

    @NameInMap("SdkCodes")
    public java.util.List<DataBusinessesValueSdkCodes> sdkCodes;

    @NameInMap("SdkFeatures")
    public java.util.List<DataBusinessesValueSdkFeatures> sdkFeatures;

    @NameInMap("Version")
    public String version;

    @NameInMap("IceOpen")
    public Integer iceOpen;

    @NameInMap("SupportPlatform")
    public Integer supportPlatform;

    @NameInMap("FunctionDesc")
    public String functionDesc;

    @NameInMap("ProductDesc")
    public String productDesc;

    @NameInMap("Size")
    public String size;

    @NameInMap("Authorized")
    public Integer authorized;

    @NameInMap("AuthorizedApp")
    public java.util.List<String> authorizedApp;

    public static DataBusinessesValue build(java.util.Map<String, ?> map) throws Exception {
        DataBusinessesValue self = new DataBusinessesValue();
        return TeaModel.build(map, self);
    }

    public DataBusinessesValue setId(Integer id) {
        this.id = id;
        return this;
    }
    public Integer getId() {
        return this.id;
    }

    public DataBusinessesValue setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DataBusinessesValue setCname(String cname) {
        this.cname = cname;
        return this;
    }
    public String getCname() {
        return this.cname;
    }

    public DataBusinessesValue setSname(String sname) {
        this.sname = sname;
        return this;
    }
    public String getSname() {
        return this.sname;
    }

    public DataBusinessesValue setSdkCodes(java.util.List<DataBusinessesValueSdkCodes> sdkCodes) {
        this.sdkCodes = sdkCodes;
        return this;
    }
    public java.util.List<DataBusinessesValueSdkCodes> getSdkCodes() {
        return this.sdkCodes;
    }

    public DataBusinessesValue setSdkFeatures(java.util.List<DataBusinessesValueSdkFeatures> sdkFeatures) {
        this.sdkFeatures = sdkFeatures;
        return this;
    }
    public java.util.List<DataBusinessesValueSdkFeatures> getSdkFeatures() {
        return this.sdkFeatures;
    }

    public DataBusinessesValue setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public DataBusinessesValue setIceOpen(Integer iceOpen) {
        this.iceOpen = iceOpen;
        return this;
    }
    public Integer getIceOpen() {
        return this.iceOpen;
    }

    public DataBusinessesValue setSupportPlatform(Integer supportPlatform) {
        this.supportPlatform = supportPlatform;
        return this;
    }
    public Integer getSupportPlatform() {
        return this.supportPlatform;
    }

    public DataBusinessesValue setFunctionDesc(String functionDesc) {
        this.functionDesc = functionDesc;
        return this;
    }
    public String getFunctionDesc() {
        return this.functionDesc;
    }

    public DataBusinessesValue setProductDesc(String productDesc) {
        this.productDesc = productDesc;
        return this;
    }
    public String getProductDesc() {
        return this.productDesc;
    }

    public DataBusinessesValue setSize(String size) {
        this.size = size;
        return this;
    }
    public String getSize() {
        return this.size;
    }

    public DataBusinessesValue setAuthorized(Integer authorized) {
        this.authorized = authorized;
        return this;
    }
    public Integer getAuthorized() {
        return this.authorized;
    }

    public DataBusinessesValue setAuthorizedApp(java.util.List<String> authorizedApp) {
        this.authorizedApp = authorizedApp;
        return this;
    }
    public java.util.List<String> getAuthorizedApp() {
        return this.authorizedApp;
    }

    public static class DataBusinessesValueSdkCodesIntegrate extends TeaModel {
        @NameInMap("Platform")
        public String platform;

        @NameInMap("Code")
        public String code;

        @NameInMap("Pkg")
        public String pkg;

        @NameInMap("Size")
        public String size;

        public static DataBusinessesValueSdkCodesIntegrate build(java.util.Map<String, ?> map) throws Exception {
            DataBusinessesValueSdkCodesIntegrate self = new DataBusinessesValueSdkCodesIntegrate();
            return TeaModel.build(map, self);
        }

        public DataBusinessesValueSdkCodesIntegrate setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public DataBusinessesValueSdkCodesIntegrate setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DataBusinessesValueSdkCodesIntegrate setPkg(String pkg) {
            this.pkg = pkg;
            return this;
        }
        public String getPkg() {
            return this.pkg;
        }

        public DataBusinessesValueSdkCodesIntegrate setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

    }

    public static class DataBusinessesValueSdkCodes extends TeaModel {
        @NameInMap("Id")
        public Integer id;

        @NameInMap("Name")
        public String name;

        @NameInMap("SellPrice")
        public String sellPrice;

        @NameInMap("IceOpen")
        public Integer iceOpen;

        @NameInMap("SupportPlatform")
        public Integer supportPlatform;

        @NameInMap("Size")
        public String size;

        @NameInMap("Authorized")
        public Integer authorized;

        @NameInMap("AuthorizedApp")
        public java.util.List<String> authorizedApp;

        @NameInMap("DefaultFeature")
        public String defaultFeature;

        @NameInMap("Integrate")
        public java.util.List<DataBusinessesValueSdkCodesIntegrate> integrate;

        @NameInMap("Subscription")
        public String subscription;

        @NameInMap("ProductDesc")
        public String productDesc;

        @NameInMap("SubscriptionPkg")
        public String subscriptionPkg;

        @NameInMap("SubscriptionImp")
        public String subscriptionImp;

        public static DataBusinessesValueSdkCodes build(java.util.Map<String, ?> map) throws Exception {
            DataBusinessesValueSdkCodes self = new DataBusinessesValueSdkCodes();
            return TeaModel.build(map, self);
        }

        public DataBusinessesValueSdkCodes setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public DataBusinessesValueSdkCodes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DataBusinessesValueSdkCodes setSellPrice(String sellPrice) {
            this.sellPrice = sellPrice;
            return this;
        }
        public String getSellPrice() {
            return this.sellPrice;
        }

        public DataBusinessesValueSdkCodes setIceOpen(Integer iceOpen) {
            this.iceOpen = iceOpen;
            return this;
        }
        public Integer getIceOpen() {
            return this.iceOpen;
        }

        public DataBusinessesValueSdkCodes setSupportPlatform(Integer supportPlatform) {
            this.supportPlatform = supportPlatform;
            return this;
        }
        public Integer getSupportPlatform() {
            return this.supportPlatform;
        }

        public DataBusinessesValueSdkCodes setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public DataBusinessesValueSdkCodes setAuthorized(Integer authorized) {
            this.authorized = authorized;
            return this;
        }
        public Integer getAuthorized() {
            return this.authorized;
        }

        public DataBusinessesValueSdkCodes setAuthorizedApp(java.util.List<String> authorizedApp) {
            this.authorizedApp = authorizedApp;
            return this;
        }
        public java.util.List<String> getAuthorizedApp() {
            return this.authorizedApp;
        }

        public DataBusinessesValueSdkCodes setDefaultFeature(String defaultFeature) {
            this.defaultFeature = defaultFeature;
            return this;
        }
        public String getDefaultFeature() {
            return this.defaultFeature;
        }

        public DataBusinessesValueSdkCodes setIntegrate(java.util.List<DataBusinessesValueSdkCodesIntegrate> integrate) {
            this.integrate = integrate;
            return this;
        }
        public java.util.List<DataBusinessesValueSdkCodesIntegrate> getIntegrate() {
            return this.integrate;
        }

        public DataBusinessesValueSdkCodes setSubscription(String subscription) {
            this.subscription = subscription;
            return this;
        }
        public String getSubscription() {
            return this.subscription;
        }

        public DataBusinessesValueSdkCodes setProductDesc(String productDesc) {
            this.productDesc = productDesc;
            return this;
        }
        public String getProductDesc() {
            return this.productDesc;
        }

        public DataBusinessesValueSdkCodes setSubscriptionPkg(String subscriptionPkg) {
            this.subscriptionPkg = subscriptionPkg;
            return this;
        }
        public String getSubscriptionPkg() {
            return this.subscriptionPkg;
        }

        public DataBusinessesValueSdkCodes setSubscriptionImp(String subscriptionImp) {
            this.subscriptionImp = subscriptionImp;
            return this;
        }
        public String getSubscriptionImp() {
            return this.subscriptionImp;
        }

    }

    public static class DataBusinessesValueSdkFeatures extends TeaModel {
        @NameInMap("Id")
        public Integer id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Scode")
        public String scode;

        @NameInMap("Svalue")
        public String svalue;

        public static DataBusinessesValueSdkFeatures build(java.util.Map<String, ?> map) throws Exception {
            DataBusinessesValueSdkFeatures self = new DataBusinessesValueSdkFeatures();
            return TeaModel.build(map, self);
        }

        public DataBusinessesValueSdkFeatures setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public DataBusinessesValueSdkFeatures setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DataBusinessesValueSdkFeatures setScode(String scode) {
            this.scode = scode;
            return this;
        }
        public String getScode() {
            return this.scode;
        }

        public DataBusinessesValueSdkFeatures setSvalue(String svalue) {
            this.svalue = svalue;
            return this;
        }
        public String getSvalue() {
            return this.svalue;
        }

    }

}
