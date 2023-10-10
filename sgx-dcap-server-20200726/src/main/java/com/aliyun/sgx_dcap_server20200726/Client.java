// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgx_dcap_server20200726;

import com.aliyun.tea.*;
import com.aliyun.sgx_dcap_server20200726.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._signatureAlgorithm = "v2";
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("sgx-dcap-server", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public String getEndpoint(String productId, String regionId, String endpointRule, String network, String suffix, java.util.Map<String, String> endpointMap, String endpoint) throws Exception {
        if (!com.aliyun.teautil.Common.empty(endpoint)) {
            return endpoint;
        }

        if (!com.aliyun.teautil.Common.isUnset(endpointMap) && !com.aliyun.teautil.Common.empty(endpointMap.get(regionId))) {
            return endpointMap.get(regionId);
        }

        return com.aliyun.endpointutil.Client.getEndpointRules(productId, regionId, endpointRule, network, suffix);
    }

    public GetQeIdentityResponse getQeIdentityWithOptions(GetQeIdentityRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acsHost)) {
            query.put("AcsHost", request.acsHost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientVpcId)) {
            query.put("ClientVpcId", request.clientVpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQeIdentity"),
            new TeaPair("version", "2020-07-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/sgx/certification/v3/qe/identity"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "string")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQeIdentityResponse());
    }

    public GetQeIdentityResponse getQeIdentity(GetQeIdentityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getQeIdentityWithOptions(request, headers, runtime);
    }

    public GetQveIdentityResponse getQveIdentityWithOptions(GetQveIdentityRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acsHost)) {
            query.put("AcsHost", request.acsHost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientVpcId)) {
            query.put("ClientVpcId", request.clientVpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQveIdentity"),
            new TeaPair("version", "2020-07-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/sgx/certification/v3/qve/identity"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "string")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQveIdentityResponse());
    }

    public GetQveIdentityResponse getQveIdentity(GetQveIdentityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getQveIdentityWithOptions(request, headers, runtime);
    }

    public GetTcbInfoResponse getTcbInfoWithOptions(GetTcbInfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acsHost)) {
            query.put("AcsHost", request.acsHost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientVpcId)) {
            query.put("ClientVpcId", request.clientVpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fmspc)) {
            query.put("fmspc", request.fmspc);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTcbInfo"),
            new TeaPair("version", "2020-07-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/sgx/certification/v3/tcb"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "string")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTcbInfoResponse());
    }

    public GetTcbInfoResponse getTcbInfo(GetTcbInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTcbInfoWithOptions(request, headers, runtime);
    }

    public PckCrlResponse pckCrlWithOptions(PckCrlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acsHost)) {
            query.put("AcsHost", request.acsHost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientVpcId)) {
            query.put("ClientVpcId", request.clientVpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ca)) {
            query.put("ca", request.ca);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PckCrl"),
            new TeaPair("version", "2020-07-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/sgx/certification/v3/pckcrl"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "string")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PckCrlResponse());
    }

    public PckCrlResponse pckCrl(PckCrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pckCrlWithOptions(request, headers, runtime);
    }

    public RootCaCrlResponse rootCaCrlWithOptions(RootCaCrlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acsHost)) {
            query.put("AcsHost", request.acsHost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientVpcId)) {
            query.put("ClientVpcId", request.clientVpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RootCaCrl"),
            new TeaPair("version", "2020-07-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/sgx/certification/v3/rootcacrl"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "string")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RootCaCrlResponse());
    }

    public RootCaCrlResponse rootCaCrl(RootCaCrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.rootCaCrlWithOptions(request, headers, runtime);
    }

    public SimplePackagePckCertResponse simplePackagePckCertWithOptions(SimplePackagePckCertRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acsHost)) {
            query.put("AcsHost", request.acsHost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientVpcId)) {
            query.put("ClientVpcId", request.clientVpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpusvn)) {
            query.put("cpusvn", request.cpusvn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptedPpid)) {
            query.put("encrypted_ppid", request.encryptedPpid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pceid)) {
            query.put("pceid", request.pceid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pcesvn)) {
            query.put("pcesvn", request.pcesvn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qeid)) {
            query.put("qeid", request.qeid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SimplePackagePckCert"),
            new TeaPair("version", "2020-07-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/sgx/certification/v3/pckcert"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "string")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SimplePackagePckCertResponse());
    }

    public SimplePackagePckCertResponse simplePackagePckCert(SimplePackagePckCertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.simplePackagePckCertWithOptions(request, headers, runtime);
    }
}
