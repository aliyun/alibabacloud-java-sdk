// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class SearchAdvertisingRequest extends TeaModel {
    @NameInMap("App")
    public SearchAdvertisingRequestApp app;

    @NameInMap("Device")
    public SearchAdvertisingRequestDevice device;

    @NameInMap("Ext")
    public java.util.Map<String, ?> ext;

    @NameInMap("Id")
    public String id;

    @NameInMap("Imp")
    public java.util.List<SearchAdvertisingRequestImp> imp;

    @NameInMap("Test")
    public Integer test;

    @NameInMap("User")
    public SearchAdvertisingRequestUser user;

    public static SearchAdvertisingRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchAdvertisingRequest self = new SearchAdvertisingRequest();
        return TeaModel.build(map, self);
    }

    public SearchAdvertisingRequest setApp(SearchAdvertisingRequestApp app) {
        this.app = app;
        return this;
    }
    public SearchAdvertisingRequestApp getApp() {
        return this.app;
    }

    public SearchAdvertisingRequest setDevice(SearchAdvertisingRequestDevice device) {
        this.device = device;
        return this;
    }
    public SearchAdvertisingRequestDevice getDevice() {
        return this.device;
    }

    public SearchAdvertisingRequest setExt(java.util.Map<String, ?> ext) {
        this.ext = ext;
        return this;
    }
    public java.util.Map<String, ?> getExt() {
        return this.ext;
    }

    public SearchAdvertisingRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public SearchAdvertisingRequest setImp(java.util.List<SearchAdvertisingRequestImp> imp) {
        this.imp = imp;
        return this;
    }
    public java.util.List<SearchAdvertisingRequestImp> getImp() {
        return this.imp;
    }

    public SearchAdvertisingRequest setTest(Integer test) {
        this.test = test;
        return this;
    }
    public Integer getTest() {
        return this.test;
    }

    public SearchAdvertisingRequest setUser(SearchAdvertisingRequestUser user) {
        this.user = user;
        return this;
    }
    public SearchAdvertisingRequestUser getUser() {
        return this.user;
    }

    public static class SearchAdvertisingRequestApp extends TeaModel {
        @NameInMap("Ext")
        public java.util.Map<String, ?> ext;

        @NameInMap("Mediaid")
        public String mediaid;

        @NameInMap("Sn")
        public String sn;

        public static SearchAdvertisingRequestApp build(java.util.Map<String, ?> map) throws Exception {
            SearchAdvertisingRequestApp self = new SearchAdvertisingRequestApp();
            return TeaModel.build(map, self);
        }

        public SearchAdvertisingRequestApp setExt(java.util.Map<String, ?> ext) {
            this.ext = ext;
            return this;
        }
        public java.util.Map<String, ?> getExt() {
            return this.ext;
        }

        public SearchAdvertisingRequestApp setMediaid(String mediaid) {
            this.mediaid = mediaid;
            return this;
        }
        public String getMediaid() {
            return this.mediaid;
        }

        public SearchAdvertisingRequestApp setSn(String sn) {
            this.sn = sn;
            return this;
        }
        public String getSn() {
            return this.sn;
        }

    }

    public static class SearchAdvertisingRequestDeviceGeo extends TeaModel {
        @NameInMap("City")
        public String city;

        @NameInMap("District")
        public String district;

        @NameInMap("Lat")
        public Double lat;

        @NameInMap("Lon")
        public Double lon;

        @NameInMap("Province")
        public String province;

        public static SearchAdvertisingRequestDeviceGeo build(java.util.Map<String, ?> map) throws Exception {
            SearchAdvertisingRequestDeviceGeo self = new SearchAdvertisingRequestDeviceGeo();
            return TeaModel.build(map, self);
        }

        public SearchAdvertisingRequestDeviceGeo setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public SearchAdvertisingRequestDeviceGeo setDistrict(String district) {
            this.district = district;
            return this;
        }
        public String getDistrict() {
            return this.district;
        }

        public SearchAdvertisingRequestDeviceGeo setLat(Double lat) {
            this.lat = lat;
            return this;
        }
        public Double getLat() {
            return this.lat;
        }

        public SearchAdvertisingRequestDeviceGeo setLon(Double lon) {
            this.lon = lon;
            return this;
        }
        public Double getLon() {
            return this.lon;
        }

        public SearchAdvertisingRequestDeviceGeo setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

    }

    public static class SearchAdvertisingRequestDevice extends TeaModel {
        @NameInMap("Androidid")
        public String androidid;

        @NameInMap("Androidmd5")
        public String androidmd5;

        @NameInMap("Caid")
        public String caid;

        @NameInMap("Carrier")
        public String carrier;

        @NameInMap("Connectiontype")
        public Integer connectiontype;

        @NameInMap("Devicetype")
        public Integer devicetype;

        @NameInMap("Geo")
        public SearchAdvertisingRequestDeviceGeo geo;

        @NameInMap("Idfa")
        public String idfa;

        @NameInMap("Imei")
        public String imei;

        @NameInMap("Imeimd5")
        public String imeimd5;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("Language")
        public String language;

        @NameInMap("Mac")
        public String mac;

        @NameInMap("Macmd5")
        public String macmd5;

        @NameInMap("Make")
        public String make;

        @NameInMap("Model")
        public String model;

        @NameInMap("Oaid")
        public String oaid;

        @NameInMap("Os")
        public String os;

        @NameInMap("Osv")
        public String osv;

        @NameInMap("Ua")
        public String ua;

        @NameInMap("Utdid")
        public String utdid;

        public static SearchAdvertisingRequestDevice build(java.util.Map<String, ?> map) throws Exception {
            SearchAdvertisingRequestDevice self = new SearchAdvertisingRequestDevice();
            return TeaModel.build(map, self);
        }

        public SearchAdvertisingRequestDevice setAndroidid(String androidid) {
            this.androidid = androidid;
            return this;
        }
        public String getAndroidid() {
            return this.androidid;
        }

        public SearchAdvertisingRequestDevice setAndroidmd5(String androidmd5) {
            this.androidmd5 = androidmd5;
            return this;
        }
        public String getAndroidmd5() {
            return this.androidmd5;
        }

        public SearchAdvertisingRequestDevice setCaid(String caid) {
            this.caid = caid;
            return this;
        }
        public String getCaid() {
            return this.caid;
        }

        public SearchAdvertisingRequestDevice setCarrier(String carrier) {
            this.carrier = carrier;
            return this;
        }
        public String getCarrier() {
            return this.carrier;
        }

        public SearchAdvertisingRequestDevice setConnectiontype(Integer connectiontype) {
            this.connectiontype = connectiontype;
            return this;
        }
        public Integer getConnectiontype() {
            return this.connectiontype;
        }

        public SearchAdvertisingRequestDevice setDevicetype(Integer devicetype) {
            this.devicetype = devicetype;
            return this;
        }
        public Integer getDevicetype() {
            return this.devicetype;
        }

        public SearchAdvertisingRequestDevice setGeo(SearchAdvertisingRequestDeviceGeo geo) {
            this.geo = geo;
            return this;
        }
        public SearchAdvertisingRequestDeviceGeo getGeo() {
            return this.geo;
        }

        public SearchAdvertisingRequestDevice setIdfa(String idfa) {
            this.idfa = idfa;
            return this;
        }
        public String getIdfa() {
            return this.idfa;
        }

        public SearchAdvertisingRequestDevice setImei(String imei) {
            this.imei = imei;
            return this;
        }
        public String getImei() {
            return this.imei;
        }

        public SearchAdvertisingRequestDevice setImeimd5(String imeimd5) {
            this.imeimd5 = imeimd5;
            return this;
        }
        public String getImeimd5() {
            return this.imeimd5;
        }

        public SearchAdvertisingRequestDevice setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public SearchAdvertisingRequestDevice setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public SearchAdvertisingRequestDevice setMac(String mac) {
            this.mac = mac;
            return this;
        }
        public String getMac() {
            return this.mac;
        }

        public SearchAdvertisingRequestDevice setMacmd5(String macmd5) {
            this.macmd5 = macmd5;
            return this;
        }
        public String getMacmd5() {
            return this.macmd5;
        }

        public SearchAdvertisingRequestDevice setMake(String make) {
            this.make = make;
            return this;
        }
        public String getMake() {
            return this.make;
        }

        public SearchAdvertisingRequestDevice setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public SearchAdvertisingRequestDevice setOaid(String oaid) {
            this.oaid = oaid;
            return this;
        }
        public String getOaid() {
            return this.oaid;
        }

        public SearchAdvertisingRequestDevice setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public SearchAdvertisingRequestDevice setOsv(String osv) {
            this.osv = osv;
            return this;
        }
        public String getOsv() {
            return this.osv;
        }

        public SearchAdvertisingRequestDevice setUa(String ua) {
            this.ua = ua;
            return this;
        }
        public String getUa() {
            return this.ua;
        }

        public SearchAdvertisingRequestDevice setUtdid(String utdid) {
            this.utdid = utdid;
            return this;
        }
        public String getUtdid() {
            return this.utdid;
        }

    }

    public static class SearchAdvertisingRequestImp extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Tagid")
        public String tagid;

        public static SearchAdvertisingRequestImp build(java.util.Map<String, ?> map) throws Exception {
            SearchAdvertisingRequestImp self = new SearchAdvertisingRequestImp();
            return TeaModel.build(map, self);
        }

        public SearchAdvertisingRequestImp setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SearchAdvertisingRequestImp setTagid(String tagid) {
            this.tagid = tagid;
            return this;
        }
        public String getTagid() {
            return this.tagid;
        }

    }

    public static class SearchAdvertisingRequestUser extends TeaModel {
        @NameInMap("Uid")
        public String uid;

        @NameInMap("Uidtype")
        public String uidtype;

        public static SearchAdvertisingRequestUser build(java.util.Map<String, ?> map) throws Exception {
            SearchAdvertisingRequestUser self = new SearchAdvertisingRequestUser();
            return TeaModel.build(map, self);
        }

        public SearchAdvertisingRequestUser setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public SearchAdvertisingRequestUser setUidtype(String uidtype) {
            this.uidtype = uidtype;
            return this;
        }
        public String getUidtype() {
            return this.uidtype;
        }

    }

}
