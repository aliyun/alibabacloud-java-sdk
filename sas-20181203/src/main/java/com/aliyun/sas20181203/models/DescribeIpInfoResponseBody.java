// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeIpInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("c2_day_trace")
    public String c2DayTrace;

    @NameInMap("city")
    public String city;

    @NameInMap("country")
    public String country;

    @NameInMap("day_cnt_30d_tor")
    public String dayCnt30dTor;

    @NameInMap("day_cnt_30d_web_attack")
    public String dayCnt30dWebAttack;

    @NameInMap("day_cnt_7d_tor")
    public String dayCnt7dTor;

    @NameInMap("day_cnt_7d_web_attack")
    public String dayCnt7dWebAttack;

    @NameInMap("geo")
    public String geo;

    @NameInMap("gmt_first_c2")
    public String gmtFirstC2;

    @NameInMap("gmt_first_mining_pool")
    public String gmtFirstMiningPool;

    @NameInMap("gmt_last_c2")
    public String gmtLastC2;

    @NameInMap("gmt_last_malicious_login")
    public String gmtLastMaliciousLogin;

    @NameInMap("gmt_last_malicious_source")
    public String gmtLastMaliciousSource;

    @NameInMap("gmt_last_mining_pool")
    public String gmtLastMiningPool;

    @NameInMap("gmt_last_nat")
    public String gmtLastNat;

    @NameInMap("gmt_last_proxy")
    public String gmtLastProxy;

    @NameInMap("gmt_last_tor")
    public String gmtLastTor;

    @NameInMap("gmt_last_web_attack")
    public String gmtLastWebAttack;

    @NameInMap("idc_name")
    public String idcName;

    @NameInMap("ip")
    public String ip;

    @NameInMap("is_c2")
    public String isC2;

    @NameInMap("is_c2_1d")
    public String isC21d;

    @NameInMap("is_c2_7d")
    public String isC27d;

    @NameInMap("is_idc")
    public String isIdc;

    @NameInMap("is_malicious_login")
    public String isMaliciousLogin;

    @NameInMap("is_malicious_login_1d")
    public String isMaliciousLogin1d;

    @NameInMap("is_malicious_login_7d")
    public String isMaliciousLogin7d;

    @NameInMap("is_malicious_source")
    public String isMaliciousSource;

    @NameInMap("is_malicious_source_1d")
    public String isMaliciousSource1d;

    @NameInMap("is_malicious_source_30d")
    public String isMaliciousSource30d;

    @NameInMap("is_malicious_source_7d")
    public String isMaliciousSource7d;

    @NameInMap("is_mining_pool")
    public String isMiningPool;

    @NameInMap("is_mining_pool_1d")
    public String isMiningPool1d;

    @NameInMap("is_mining_pool_7d")
    public String isMiningPool7d;

    @NameInMap("is_nat")
    public String isNat;

    @NameInMap("is_nat_1d")
    public String isNat1d;

    @NameInMap("is_nat_7d")
    public String isNat7d;

    @NameInMap("is_proxy")
    public String isProxy;

    @NameInMap("is_proxy_1d")
    public String isProxy1d;

    @NameInMap("is_proxy_7d")
    public String isProxy7d;

    @NameInMap("is_tor")
    public String isTor;

    @NameInMap("is_tor_1d")
    public String isTor1d;

    @NameInMap("is_tor_7d")
    public String isTor7d;

    @NameInMap("is_web_attack")
    public String isWebAttack;

    @NameInMap("is_web_attack_1d")
    public String isWebAttack1d;

    @NameInMap("is_web_attack_30d")
    public String isWebAttack30d;

    @NameInMap("is_web_attack_7d")
    public String isWebAttack7d;

    @NameInMap("isp")
    public String isp;

    @NameInMap("malicious_login_day_trace")
    public String maliciousLoginDayTrace;

    @NameInMap("malicious_score")
    public String maliciousScore;

    @NameInMap("malicious_source_day_trace")
    public String maliciousSourceDayTrace;

    @NameInMap("mining_pool_day_trace")
    public String miningPoolDayTrace;

    @NameInMap("nat_day_trace")
    public String natDayTrace;

    @NameInMap("province")
    public String province;

    @NameInMap("proxy_day_trace")
    public String proxyDayTrace;

    @NameInMap("rdns")
    public String rdns;

    @NameInMap("tags")
    public String tags;

    @NameInMap("tor_day_trace")
    public String torDayTrace;

    @NameInMap("total_day_cnt_tor")
    public String totalDayCntTor;

    @NameInMap("total_day_cnt_web_attack")
    public String totalDayCntWebAttack;

    @NameInMap("web_attack_day_trace")
    public String webAttackDayTrace;

    public static DescribeIpInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpInfoResponseBody self = new DescribeIpInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIpInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeIpInfoResponseBody setC2DayTrace(String c2DayTrace) {
        this.c2DayTrace = c2DayTrace;
        return this;
    }
    public String getC2DayTrace() {
        return this.c2DayTrace;
    }

    public DescribeIpInfoResponseBody setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public DescribeIpInfoResponseBody setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public DescribeIpInfoResponseBody setDayCnt30dTor(String dayCnt30dTor) {
        this.dayCnt30dTor = dayCnt30dTor;
        return this;
    }
    public String getDayCnt30dTor() {
        return this.dayCnt30dTor;
    }

    public DescribeIpInfoResponseBody setDayCnt30dWebAttack(String dayCnt30dWebAttack) {
        this.dayCnt30dWebAttack = dayCnt30dWebAttack;
        return this;
    }
    public String getDayCnt30dWebAttack() {
        return this.dayCnt30dWebAttack;
    }

    public DescribeIpInfoResponseBody setDayCnt7dTor(String dayCnt7dTor) {
        this.dayCnt7dTor = dayCnt7dTor;
        return this;
    }
    public String getDayCnt7dTor() {
        return this.dayCnt7dTor;
    }

    public DescribeIpInfoResponseBody setDayCnt7dWebAttack(String dayCnt7dWebAttack) {
        this.dayCnt7dWebAttack = dayCnt7dWebAttack;
        return this;
    }
    public String getDayCnt7dWebAttack() {
        return this.dayCnt7dWebAttack;
    }

    public DescribeIpInfoResponseBody setGeo(String geo) {
        this.geo = geo;
        return this;
    }
    public String getGeo() {
        return this.geo;
    }

    public DescribeIpInfoResponseBody setGmtFirstC2(String gmtFirstC2) {
        this.gmtFirstC2 = gmtFirstC2;
        return this;
    }
    public String getGmtFirstC2() {
        return this.gmtFirstC2;
    }

    public DescribeIpInfoResponseBody setGmtFirstMiningPool(String gmtFirstMiningPool) {
        this.gmtFirstMiningPool = gmtFirstMiningPool;
        return this;
    }
    public String getGmtFirstMiningPool() {
        return this.gmtFirstMiningPool;
    }

    public DescribeIpInfoResponseBody setGmtLastC2(String gmtLastC2) {
        this.gmtLastC2 = gmtLastC2;
        return this;
    }
    public String getGmtLastC2() {
        return this.gmtLastC2;
    }

    public DescribeIpInfoResponseBody setGmtLastMaliciousLogin(String gmtLastMaliciousLogin) {
        this.gmtLastMaliciousLogin = gmtLastMaliciousLogin;
        return this;
    }
    public String getGmtLastMaliciousLogin() {
        return this.gmtLastMaliciousLogin;
    }

    public DescribeIpInfoResponseBody setGmtLastMaliciousSource(String gmtLastMaliciousSource) {
        this.gmtLastMaliciousSource = gmtLastMaliciousSource;
        return this;
    }
    public String getGmtLastMaliciousSource() {
        return this.gmtLastMaliciousSource;
    }

    public DescribeIpInfoResponseBody setGmtLastMiningPool(String gmtLastMiningPool) {
        this.gmtLastMiningPool = gmtLastMiningPool;
        return this;
    }
    public String getGmtLastMiningPool() {
        return this.gmtLastMiningPool;
    }

    public DescribeIpInfoResponseBody setGmtLastNat(String gmtLastNat) {
        this.gmtLastNat = gmtLastNat;
        return this;
    }
    public String getGmtLastNat() {
        return this.gmtLastNat;
    }

    public DescribeIpInfoResponseBody setGmtLastProxy(String gmtLastProxy) {
        this.gmtLastProxy = gmtLastProxy;
        return this;
    }
    public String getGmtLastProxy() {
        return this.gmtLastProxy;
    }

    public DescribeIpInfoResponseBody setGmtLastTor(String gmtLastTor) {
        this.gmtLastTor = gmtLastTor;
        return this;
    }
    public String getGmtLastTor() {
        return this.gmtLastTor;
    }

    public DescribeIpInfoResponseBody setGmtLastWebAttack(String gmtLastWebAttack) {
        this.gmtLastWebAttack = gmtLastWebAttack;
        return this;
    }
    public String getGmtLastWebAttack() {
        return this.gmtLastWebAttack;
    }

    public DescribeIpInfoResponseBody setIdcName(String idcName) {
        this.idcName = idcName;
        return this;
    }
    public String getIdcName() {
        return this.idcName;
    }

    public DescribeIpInfoResponseBody setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public DescribeIpInfoResponseBody setIsC2(String isC2) {
        this.isC2 = isC2;
        return this;
    }
    public String getIsC2() {
        return this.isC2;
    }

    public DescribeIpInfoResponseBody setIsC21d(String isC21d) {
        this.isC21d = isC21d;
        return this;
    }
    public String getIsC21d() {
        return this.isC21d;
    }

    public DescribeIpInfoResponseBody setIsC27d(String isC27d) {
        this.isC27d = isC27d;
        return this;
    }
    public String getIsC27d() {
        return this.isC27d;
    }

    public DescribeIpInfoResponseBody setIsIdc(String isIdc) {
        this.isIdc = isIdc;
        return this;
    }
    public String getIsIdc() {
        return this.isIdc;
    }

    public DescribeIpInfoResponseBody setIsMaliciousLogin(String isMaliciousLogin) {
        this.isMaliciousLogin = isMaliciousLogin;
        return this;
    }
    public String getIsMaliciousLogin() {
        return this.isMaliciousLogin;
    }

    public DescribeIpInfoResponseBody setIsMaliciousLogin1d(String isMaliciousLogin1d) {
        this.isMaliciousLogin1d = isMaliciousLogin1d;
        return this;
    }
    public String getIsMaliciousLogin1d() {
        return this.isMaliciousLogin1d;
    }

    public DescribeIpInfoResponseBody setIsMaliciousLogin7d(String isMaliciousLogin7d) {
        this.isMaliciousLogin7d = isMaliciousLogin7d;
        return this;
    }
    public String getIsMaliciousLogin7d() {
        return this.isMaliciousLogin7d;
    }

    public DescribeIpInfoResponseBody setIsMaliciousSource(String isMaliciousSource) {
        this.isMaliciousSource = isMaliciousSource;
        return this;
    }
    public String getIsMaliciousSource() {
        return this.isMaliciousSource;
    }

    public DescribeIpInfoResponseBody setIsMaliciousSource1d(String isMaliciousSource1d) {
        this.isMaliciousSource1d = isMaliciousSource1d;
        return this;
    }
    public String getIsMaliciousSource1d() {
        return this.isMaliciousSource1d;
    }

    public DescribeIpInfoResponseBody setIsMaliciousSource30d(String isMaliciousSource30d) {
        this.isMaliciousSource30d = isMaliciousSource30d;
        return this;
    }
    public String getIsMaliciousSource30d() {
        return this.isMaliciousSource30d;
    }

    public DescribeIpInfoResponseBody setIsMaliciousSource7d(String isMaliciousSource7d) {
        this.isMaliciousSource7d = isMaliciousSource7d;
        return this;
    }
    public String getIsMaliciousSource7d() {
        return this.isMaliciousSource7d;
    }

    public DescribeIpInfoResponseBody setIsMiningPool(String isMiningPool) {
        this.isMiningPool = isMiningPool;
        return this;
    }
    public String getIsMiningPool() {
        return this.isMiningPool;
    }

    public DescribeIpInfoResponseBody setIsMiningPool1d(String isMiningPool1d) {
        this.isMiningPool1d = isMiningPool1d;
        return this;
    }
    public String getIsMiningPool1d() {
        return this.isMiningPool1d;
    }

    public DescribeIpInfoResponseBody setIsMiningPool7d(String isMiningPool7d) {
        this.isMiningPool7d = isMiningPool7d;
        return this;
    }
    public String getIsMiningPool7d() {
        return this.isMiningPool7d;
    }

    public DescribeIpInfoResponseBody setIsNat(String isNat) {
        this.isNat = isNat;
        return this;
    }
    public String getIsNat() {
        return this.isNat;
    }

    public DescribeIpInfoResponseBody setIsNat1d(String isNat1d) {
        this.isNat1d = isNat1d;
        return this;
    }
    public String getIsNat1d() {
        return this.isNat1d;
    }

    public DescribeIpInfoResponseBody setIsNat7d(String isNat7d) {
        this.isNat7d = isNat7d;
        return this;
    }
    public String getIsNat7d() {
        return this.isNat7d;
    }

    public DescribeIpInfoResponseBody setIsProxy(String isProxy) {
        this.isProxy = isProxy;
        return this;
    }
    public String getIsProxy() {
        return this.isProxy;
    }

    public DescribeIpInfoResponseBody setIsProxy1d(String isProxy1d) {
        this.isProxy1d = isProxy1d;
        return this;
    }
    public String getIsProxy1d() {
        return this.isProxy1d;
    }

    public DescribeIpInfoResponseBody setIsProxy7d(String isProxy7d) {
        this.isProxy7d = isProxy7d;
        return this;
    }
    public String getIsProxy7d() {
        return this.isProxy7d;
    }

    public DescribeIpInfoResponseBody setIsTor(String isTor) {
        this.isTor = isTor;
        return this;
    }
    public String getIsTor() {
        return this.isTor;
    }

    public DescribeIpInfoResponseBody setIsTor1d(String isTor1d) {
        this.isTor1d = isTor1d;
        return this;
    }
    public String getIsTor1d() {
        return this.isTor1d;
    }

    public DescribeIpInfoResponseBody setIsTor7d(String isTor7d) {
        this.isTor7d = isTor7d;
        return this;
    }
    public String getIsTor7d() {
        return this.isTor7d;
    }

    public DescribeIpInfoResponseBody setIsWebAttack(String isWebAttack) {
        this.isWebAttack = isWebAttack;
        return this;
    }
    public String getIsWebAttack() {
        return this.isWebAttack;
    }

    public DescribeIpInfoResponseBody setIsWebAttack1d(String isWebAttack1d) {
        this.isWebAttack1d = isWebAttack1d;
        return this;
    }
    public String getIsWebAttack1d() {
        return this.isWebAttack1d;
    }

    public DescribeIpInfoResponseBody setIsWebAttack30d(String isWebAttack30d) {
        this.isWebAttack30d = isWebAttack30d;
        return this;
    }
    public String getIsWebAttack30d() {
        return this.isWebAttack30d;
    }

    public DescribeIpInfoResponseBody setIsWebAttack7d(String isWebAttack7d) {
        this.isWebAttack7d = isWebAttack7d;
        return this;
    }
    public String getIsWebAttack7d() {
        return this.isWebAttack7d;
    }

    public DescribeIpInfoResponseBody setIsp(String isp) {
        this.isp = isp;
        return this;
    }
    public String getIsp() {
        return this.isp;
    }

    public DescribeIpInfoResponseBody setMaliciousLoginDayTrace(String maliciousLoginDayTrace) {
        this.maliciousLoginDayTrace = maliciousLoginDayTrace;
        return this;
    }
    public String getMaliciousLoginDayTrace() {
        return this.maliciousLoginDayTrace;
    }

    public DescribeIpInfoResponseBody setMaliciousScore(String maliciousScore) {
        this.maliciousScore = maliciousScore;
        return this;
    }
    public String getMaliciousScore() {
        return this.maliciousScore;
    }

    public DescribeIpInfoResponseBody setMaliciousSourceDayTrace(String maliciousSourceDayTrace) {
        this.maliciousSourceDayTrace = maliciousSourceDayTrace;
        return this;
    }
    public String getMaliciousSourceDayTrace() {
        return this.maliciousSourceDayTrace;
    }

    public DescribeIpInfoResponseBody setMiningPoolDayTrace(String miningPoolDayTrace) {
        this.miningPoolDayTrace = miningPoolDayTrace;
        return this;
    }
    public String getMiningPoolDayTrace() {
        return this.miningPoolDayTrace;
    }

    public DescribeIpInfoResponseBody setNatDayTrace(String natDayTrace) {
        this.natDayTrace = natDayTrace;
        return this;
    }
    public String getNatDayTrace() {
        return this.natDayTrace;
    }

    public DescribeIpInfoResponseBody setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

    public DescribeIpInfoResponseBody setProxyDayTrace(String proxyDayTrace) {
        this.proxyDayTrace = proxyDayTrace;
        return this;
    }
    public String getProxyDayTrace() {
        return this.proxyDayTrace;
    }

    public DescribeIpInfoResponseBody setRdns(String rdns) {
        this.rdns = rdns;
        return this;
    }
    public String getRdns() {
        return this.rdns;
    }

    public DescribeIpInfoResponseBody setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public DescribeIpInfoResponseBody setTorDayTrace(String torDayTrace) {
        this.torDayTrace = torDayTrace;
        return this;
    }
    public String getTorDayTrace() {
        return this.torDayTrace;
    }

    public DescribeIpInfoResponseBody setTotalDayCntTor(String totalDayCntTor) {
        this.totalDayCntTor = totalDayCntTor;
        return this;
    }
    public String getTotalDayCntTor() {
        return this.totalDayCntTor;
    }

    public DescribeIpInfoResponseBody setTotalDayCntWebAttack(String totalDayCntWebAttack) {
        this.totalDayCntWebAttack = totalDayCntWebAttack;
        return this;
    }
    public String getTotalDayCntWebAttack() {
        return this.totalDayCntWebAttack;
    }

    public DescribeIpInfoResponseBody setWebAttackDayTrace(String webAttackDayTrace) {
        this.webAttackDayTrace = webAttackDayTrace;
        return this;
    }
    public String getWebAttackDayTrace() {
        return this.webAttackDayTrace;
    }

}
