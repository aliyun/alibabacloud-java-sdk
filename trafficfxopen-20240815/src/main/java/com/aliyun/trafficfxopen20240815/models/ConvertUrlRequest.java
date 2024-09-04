// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trafficfxopen20240815.models;

import com.aliyun.tea.*;

public class ConvertUrlRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>+86</p>
     */
    @NameInMap("countryCallingCode")
    public String countryCallingCode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>https%3A%2F%2Fmarket.wapa.taobao.com%2Fapp%2Ftrip%2Frx-traffic%2Fpages%2Fota%3F_F_sht_sm%3D12345678%26leaveFlightNo%3DCZ6132%26arrCityCode%3DDLC%26arrCityName%3D%25E5%25A4%25A7%25E8%25BF%259E%26leaveCabinClass%3D0%26itemParams%3DmQZ4eyJhZHRQcmljZSI6MzEyLCJhZnRlclByb21vdGlvbgUamFNlYXJjaCI6dHJ1ZSwiYWdlbnRJZCI6IjUwNTUiLCJhdmVyYWdlUAFFdFNob3ciOmZhbHNlLCJjYWJpbiI6IloiLCJjaGlsZAVODWgUZmlyc3RDASJkQ2xhc3MiOiJBTExfQ0FCSU4iLCJpbmZhbnQNMMgxNDAsIml0ZW1JZCI6IjEyZDJhZTdiMzk0ZjQ5MWY5MjE2ZjQzMzBjYjdkY2E5XzY2IiwFL_BCVHlwZSI6MSwibGVhdmVGbGlnaHRObyI6IkNaNjEzMiIsInByZVF1ZXJ5VGltZXN0YW1wIjoxNzI1MzQyMzI0MDU3LAEiEFRyYWNlBXscMjEwM2EzNDAVJDQwNDM3MjEyNmQzZTY4IgFQLjgBFCI6MCwicyU9GFNlZ21lbnQB53hbe1wiYXJyQ2l0eUNvZGVcIjpcIkRMQ1wiLFwiZGVwMhgACEJKUxEYCERhdAksODIwMjQtMTAtMTRcIn1dIgFiDGxlY3QJ3xhIYXNTdG9wNYMAcwUcBGVkRoAAGEFpcnBvcnRCgwBqmwA-MwAIUEtYEZ6qtgAgIDA4OjMwOjAwBTwoam91cm5leVNlcVwhLyhcIm1hcmtldGluZwnRBE5vJSEpshHxFHVwcGx5QVWIFCxbNTQ0NyULBRoQT2ZmZXJRrx0TsExpbmtlZElkIjoiYTAzOTk4MzZkZGUzNDBhMTlhZGQ2NzU4ZDZkNjQ1YjEifQ%253D%253D%26depCityName%3D%25E5%258C%2597%25E4%25BA%25AC%26leaveDate%3D2024-10-14%26fpt%3Dta.fx%2528017595%2529017595%26_fli_webview%3Dfalse%26ttid%3Ddidi.000017598%26depCityCode%3DBJS</p>
     */
    @NameInMap("jumpUrl")
    public String jumpUrl;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("phone")
    public String phone;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("scene")
    public String scene;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("source")
    public String source;

    /**
     * <strong>example:</strong>
     * <p>2215112050977</p>
     */
    @NameInMap("thirdId")
    public String thirdId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("uid")
    public String uid;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("xenv")
    public String xenv;

    public static ConvertUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        ConvertUrlRequest self = new ConvertUrlRequest();
        return TeaModel.build(map, self);
    }

    public ConvertUrlRequest setCountryCallingCode(String countryCallingCode) {
        this.countryCallingCode = countryCallingCode;
        return this;
    }
    public String getCountryCallingCode() {
        return this.countryCallingCode;
    }

    public ConvertUrlRequest setJumpUrl(String jumpUrl) {
        this.jumpUrl = jumpUrl;
        return this;
    }
    public String getJumpUrl() {
        return this.jumpUrl;
    }

    public ConvertUrlRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public ConvertUrlRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public ConvertUrlRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ConvertUrlRequest setThirdId(String thirdId) {
        this.thirdId = thirdId;
        return this;
    }
    public String getThirdId() {
        return this.thirdId;
    }

    public ConvertUrlRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public ConvertUrlRequest setXenv(String xenv) {
        this.xenv = xenv;
        return this;
    }
    public String getXenv() {
        return this.xenv;
    }

}
