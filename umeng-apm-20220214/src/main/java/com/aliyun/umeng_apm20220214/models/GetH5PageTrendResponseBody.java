// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_apm20220214.models;

import com.aliyun.tea.*;

public class GetH5PageTrendResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public Long code;

    @NameInMap("data")
    public java.util.List<GetH5PageTrendResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>succeed in handling request</p>
     */
    @NameInMap("msg")
    public String msg;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>504.89</p>
         */
        @NameInMap("analyzeDOM")
        public Double analyzeDOM;

        /**
         * <strong>example:</strong>
         * <p>49.48</p>
         */
        @NameInMap("appCache")
        public Double appCache;

        /**
         * <strong>example:</strong>
         * <p>979.83</p>
         */
        @NameInMap("contentTrans")
        public Double contentTrans;

        /**
         * <strong>example:</strong>
         * <p>50.16</p>
         */
        @NameInMap("dns")
        public Double dns;

        /**
         * <strong>example:</strong>
         * <p>1881.96</p>
         */
        @NameInMap("domReady")
        public Double domReady;

        /**
         * <strong>example:</strong>
         * <p>190.69</p>
         */
        @NameInMap("fcp")
        public Double fcp;

        /**
         * <strong>example:</strong>
         * <p>472.57</p>
         */
        @NameInMap("firstByte")
        public Double firstByte;

        /**
         * <strong>example:</strong>
         * <p>44.67</p>
         */
        @NameInMap("fiveSecondRate")
        public Double fiveSecondRate;

        /**
         * <strong>example:</strong>
         * <p>50.25</p>
         */
        @NameInMap("fp")
        public Double fp;

        /**
         * <strong>example:</strong>
         * <p>492.86</p>
         */
        @NameInMap("loadEvent")
        public Double loadEvent;

        /**
         * <strong>example:</strong>
         * <p>4741.44</p>
         */
        @NameInMap("loadFinish")
        public Double loadFinish;

        /**
         * <strong>example:</strong>
         * <p>2549.46</p>
         */
        @NameInMap("loadResource")
        public Double loadResource;

        /**
         * <strong>example:</strong>
         * <p>2062</p>
         */
        @NameInMap("logCnt")
        public Long logCnt;

        /**
         * <strong>example:</strong>
         * <p>0.19</p>
         */
        @NameInMap("oneSecondRate")
        public Double oneSecondRate;

        /**
         * <strong>example:</strong>
         * <p>100.93</p>
         */
        @NameInMap("redirect")
        public Double redirect;

        /**
         * <strong>example:</strong>
         * <p>71.02</p>
         */
        @NameInMap("ssl")
        public Double ssl;

        /**
         * <strong>example:</strong>
         * <p>150.18</p>
         */
        @NameInMap("tcp")
        public Double tcp;

        /**
         * <strong>example:</strong>
         * <p>2023-05-20</p>
         */
        @NameInMap("timePoint")
        public String timePoint;

        /**
         * <strong>example:</strong>
         * <p>249.55</p>
         */
        @NameInMap("ttfb")
        public Double ttfb;

        /**
         * <strong>example:</strong>
         * <p>2126.61</p>
         */
        @NameInMap("tti")
        public Double tti;

        /**
         * <strong>example:</strong>
         * <p>4.9</p>
         */
        @NameInMap("twoSecondRate")
        public Double twoSecondRate;

        /**
         * <strong>example:</strong>
         * <p>98.26</p>
         */
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
