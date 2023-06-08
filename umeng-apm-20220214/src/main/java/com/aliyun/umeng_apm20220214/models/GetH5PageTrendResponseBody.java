// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_apm20220214.models;

import com.aliyun.tea.*;

public class GetH5PageTrendResponseBody extends TeaModel {
    @NameInMap("code")
    public Long code;

    @NameInMap("data")
    public java.util.List<GetH5PageTrendResponseBodyData> data;

    @NameInMap("msg")
    public String msg;

    @NameInMap("success")
    public Boolean success;

    public static GetH5PageTrendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetH5PageTrendResponseBody self = new GetH5PageTrendResponseBody();
        return TeaModel.build(map, self);
    }

    public GetH5PageTrendResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetH5PageTrendResponseBody setData(java.util.List<GetH5PageTrendResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetH5PageTrendResponseBodyData> getData() {
        return this.data;
    }

    public GetH5PageTrendResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public GetH5PageTrendResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetH5PageTrendResponseBodyData extends TeaModel {
        @NameInMap("analyzeDOM")
        public Double analyzeDOM;

        @NameInMap("appCache")
        public Double appCache;

        @NameInMap("contentTrans")
        public Double contentTrans;

        @NameInMap("dns")
        public Double dns;

        @NameInMap("domReady")
        public Double domReady;

        @NameInMap("fcp")
        public Double fcp;

        @NameInMap("firstByte")
        public Double firstByte;

        @NameInMap("fiveSecondRate")
        public Double fiveSecondRate;

        @NameInMap("fp")
        public Double fp;

        @NameInMap("loadEvent")
        public Double loadEvent;

        @NameInMap("loadFinish")
        public Double loadFinish;

        @NameInMap("loadResource")
        public Double loadResource;

        @NameInMap("logCnt")
        public Long logCnt;

        @NameInMap("oneSecondRate")
        public Double oneSecondRate;

        @NameInMap("redirect")
        public Double redirect;

        @NameInMap("ssl")
        public Double ssl;

        @NameInMap("tcp")
        public Double tcp;

        @NameInMap("timePoint")
        public String timePoint;

        @NameInMap("ttfb")
        public Double ttfb;

        @NameInMap("tti")
        public Double tti;

        @NameInMap("twoSecondRate")
        public Double twoSecondRate;

        @NameInMap("unload")
        public Double unload;

        public static GetH5PageTrendResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetH5PageTrendResponseBodyData self = new GetH5PageTrendResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetH5PageTrendResponseBodyData setAnalyzeDOM(Double analyzeDOM) {
            this.analyzeDOM = analyzeDOM;
            return this;
        }
        public Double getAnalyzeDOM() {
            return this.analyzeDOM;
        }

        public GetH5PageTrendResponseBodyData setAppCache(Double appCache) {
            this.appCache = appCache;
            return this;
        }
        public Double getAppCache() {
            return this.appCache;
        }

        public GetH5PageTrendResponseBodyData setContentTrans(Double contentTrans) {
            this.contentTrans = contentTrans;
            return this;
        }
        public Double getContentTrans() {
            return this.contentTrans;
        }

        public GetH5PageTrendResponseBodyData setDns(Double dns) {
            this.dns = dns;
            return this;
        }
        public Double getDns() {
            return this.dns;
        }

        public GetH5PageTrendResponseBodyData setDomReady(Double domReady) {
            this.domReady = domReady;
            return this;
        }
        public Double getDomReady() {
            return this.domReady;
        }

        public GetH5PageTrendResponseBodyData setFcp(Double fcp) {
            this.fcp = fcp;
            return this;
        }
        public Double getFcp() {
            return this.fcp;
        }

        public GetH5PageTrendResponseBodyData setFirstByte(Double firstByte) {
            this.firstByte = firstByte;
            return this;
        }
        public Double getFirstByte() {
            return this.firstByte;
        }

        public GetH5PageTrendResponseBodyData setFiveSecondRate(Double fiveSecondRate) {
            this.fiveSecondRate = fiveSecondRate;
            return this;
        }
        public Double getFiveSecondRate() {
            return this.fiveSecondRate;
        }

        public GetH5PageTrendResponseBodyData setFp(Double fp) {
            this.fp = fp;
            return this;
        }
        public Double getFp() {
            return this.fp;
        }

        public GetH5PageTrendResponseBodyData setLoadEvent(Double loadEvent) {
            this.loadEvent = loadEvent;
            return this;
        }
        public Double getLoadEvent() {
            return this.loadEvent;
        }

        public GetH5PageTrendResponseBodyData setLoadFinish(Double loadFinish) {
            this.loadFinish = loadFinish;
            return this;
        }
        public Double getLoadFinish() {
            return this.loadFinish;
        }

        public GetH5PageTrendResponseBodyData setLoadResource(Double loadResource) {
            this.loadResource = loadResource;
            return this;
        }
        public Double getLoadResource() {
            return this.loadResource;
        }

        public GetH5PageTrendResponseBodyData setLogCnt(Long logCnt) {
            this.logCnt = logCnt;
            return this;
        }
        public Long getLogCnt() {
            return this.logCnt;
        }

        public GetH5PageTrendResponseBodyData setOneSecondRate(Double oneSecondRate) {
            this.oneSecondRate = oneSecondRate;
            return this;
        }
        public Double getOneSecondRate() {
            return this.oneSecondRate;
        }

        public GetH5PageTrendResponseBodyData setRedirect(Double redirect) {
            this.redirect = redirect;
            return this;
        }
        public Double getRedirect() {
            return this.redirect;
        }

        public GetH5PageTrendResponseBodyData setSsl(Double ssl) {
            this.ssl = ssl;
            return this;
        }
        public Double getSsl() {
            return this.ssl;
        }

        public GetH5PageTrendResponseBodyData setTcp(Double tcp) {
            this.tcp = tcp;
            return this;
        }
        public Double getTcp() {
            return this.tcp;
        }

        public GetH5PageTrendResponseBodyData setTimePoint(String timePoint) {
            this.timePoint = timePoint;
            return this;
        }
        public String getTimePoint() {
            return this.timePoint;
        }

        public GetH5PageTrendResponseBodyData setTtfb(Double ttfb) {
            this.ttfb = ttfb;
            return this;
        }
        public Double getTtfb() {
            return this.ttfb;
        }

        public GetH5PageTrendResponseBodyData setTti(Double tti) {
            this.tti = tti;
            return this;
        }
        public Double getTti() {
            return this.tti;
        }

        public GetH5PageTrendResponseBodyData setTwoSecondRate(Double twoSecondRate) {
            this.twoSecondRate = twoSecondRate;
            return this;
        }
        public Double getTwoSecondRate() {
            return this.twoSecondRate;
        }

        public GetH5PageTrendResponseBodyData setUnload(Double unload) {
            this.unload = unload;
            return this;
        }
        public Double getUnload() {
            return this.unload;
        }

    }

}
