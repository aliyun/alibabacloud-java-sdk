// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeRideHailingItineraryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>noPermission</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>{&quot;data&quot;:{&quot;serviceProvider&quot;:&quot;滴滴出行&quot;,&quot;applicationDate&quot;:&quot;&quot;,&quot;startTime&quot;:&quot;&quot;,&quot;endTime&quot;:&quot;&quot;,&quot;phoneNumber&quot;:&quot;&quot;,&quot;totalAmount&quot;:&quot;&quot;,&quot;rideDetails&quot;:[{&quot;Number&quot;:&quot;&quot;,&quot;carType&quot;:&quot;&quot;,&quot;pickUpTime&quot;:&quot;&quot;,&quot;city&quot;:&quot;&quot;,&quot;startPlace&quot;:&quot;&quot;,&quot;endPlace&quot;:&quot;&quot;,&quot;mileage&quot;:&quot;&quot;,&quot;amount&quot;:&quot;&quot;,&quot;remarks&quot;:&quot;&quot;}]},&quot;ftype&quot;:0,&quot;height&quot;:260,&quot;orgHeight&quot;:260,&quot;orgWidth&quot;:194,&quot;prism_keyValueInfo&quot;:[{&quot;key&quot;:&quot;serviceProvider&quot;,&quot;keyProb&quot;:99,&quot;value&quot;:&quot;滴滴出行&quot;,&quot;valuePos&quot;:[{&quot;x&quot;:120,&quot;y&quot;:11},{&quot;x&quot;:120,&quot;y&quot;:21},{&quot;x&quot;:57,&quot;y&quot;:20},{&quot;x&quot;:57,&quot;y&quot;:10}],&quot;valueProb&quot;:99},{&quot;key&quot;:&quot;applicationDate&quot;,&quot;keyProb&quot;:100,&quot;value&quot;:&quot;&quot;,&quot;valueProb&quot;:100},{&quot;key&quot;:&quot;startTime&quot;,&quot;keyProb&quot;:91,&quot;value&quot;:&quot;&quot;,&quot;valuePos&quot;:[{&quot;x&quot;:94,&quot;y&quot;:46},{&quot;x&quot;:94,&quot;y&quot;:50},{&quot;x&quot;:75,&quot;y&quot;:50},{&quot;x&quot;:75,&quot;y&quot;:46}],&quot;valueProb&quot;:91},{&quot;key&quot;:&quot;endTime&quot;,&quot;keyProb&quot;:65,&quot;value&quot;:&quot;&quot;,&quot;valuePos&quot;:[{&quot;x&quot;:112,&quot;y&quot;:46},{&quot;x&quot;:112,&quot;y&quot;:50},{&quot;x&quot;:95,&quot;y&quot;:50},{&quot;x&quot;:95,&quot;y&quot;:46}],&quot;valueProb&quot;:65},{&quot;key&quot;:&quot;phoneNumber&quot;,&quot;keyProb&quot;:100,&quot;value&quot;:&quot;&quot;,&quot;valueProb&quot;:100},{&quot;key&quot;:&quot;totalAmount&quot;,&quot;keyProb&quot;:100,&quot;value&quot;:&quot;&quot;,&quot;valueProb&quot;:100},{&quot;key&quot;:&quot;rideDetails&quot;,&quot;keyProb&quot;:100,&quot;value&quot;:&quot;[{&quot;Number&quot;:&quot;&quot;,&quot;carType&quot;:&quot;&quot;,&quot;pickUpTime&quot;:&quot;&quot;,&quot;city&quot;:&quot;&quot;,&quot;startPlace&quot;:&quot;&quot;,&quot;endPlace&quot;:&quot;&quot;,&quot;mileage&quot;:&quot;&quot;,&quot;amount&quot;:&quot;&quot;,&quot;remarks&quot;:&quot;&quot;}]&quot;,&quot;valueProb&quot;:100}],&quot;sliceRect&quot;:{&quot;x0&quot;:6,&quot;y0&quot;:72,&quot;x1&quot;:186,&quot;y1&quot;:72,&quot;x2&quot;:186,&quot;y2&quot;:156,&quot;x3&quot;:6,&quot;y3&quot;:156},&quot;width&quot;:194}</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <strong>example:</strong>
     * <p>You are not authorized to perform this operation.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>43A29C77-405E-4CC0-BC55-EE694AD00655</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RecognizeRideHailingItineraryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeRideHailingItineraryResponseBody self = new RecognizeRideHailingItineraryResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeRideHailingItineraryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RecognizeRideHailingItineraryResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public RecognizeRideHailingItineraryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RecognizeRideHailingItineraryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
