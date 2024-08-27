// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class ApplyTokenResponseBody extends TeaModel {
    /**
     * <p>The request ID. This parameter is a common parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>31782AAF-D0CC-44C3-ABFD-1B500276****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The token that is returned by the ApsaraMQ for MQTT broker.</p>
     * <blockquote>
     * <p> Do not assume the length, format, or rule of the token to return. The actual returned token shall prevail.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>LzMT+XLFl5s/YWJ/MlDz4t/Lq5HC1iGU1P28HAMaxYxn8aQbALNtml7QZKl9L9kPe6LqUb95tEVo+zUqOogs9+jZwDUSzsd4X4qaD3n2TrBEuMOqKkk1Xdrvu9VBQQvIYbz7MJWZDYC3DlW7gLEr33Cuj54iIhagtBi3epStJitsssWs7otY9zhKOSZxhr49G3d0bh35mwyP18EMvDas8UlzeSozsSrujNUqZXOGK0PEBSd+rWMGDJlCt6GFmJgm2JFY7PJwf/7OOSmUYIYFs5o/PuPpoTMF+hcVXMs+0yDukIMTOzG9m3t8k36PVrghFmnK6pC3Rt3mibjW****ng==</p>
     */
    @NameInMap("Token")
    public String token;

    public static ApplyTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplyTokenResponseBody self = new ApplyTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplyTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ApplyTokenResponseBody setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
