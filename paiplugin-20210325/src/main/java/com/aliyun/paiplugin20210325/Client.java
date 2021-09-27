// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20210325;

import com.aliyun.tea.*;
import com.aliyun.paiplugin20210325.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("paiplugin", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public CreateSignatureResponse createSignature(CreateSignatureRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSignatureWithOptions(request, headers, runtime);
    }

    public CreateSignatureResponse createSignatureWithOptions(CreateSignatureRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certificates)) {
            body.put("Certificates", request.certificates);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.powerOfAttorney)) {
            body.put("PowerOfAttorney", request.powerOfAttorney);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processInstanceID)) {
            body.put("ProcessInstanceID", request.processInstanceID);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("CreateSignature", "2021-03-25", "HTTPS", "POST", "AK", "/api/v1/signatures", "json", req, runtime), new CreateSignatureResponse());
    }

    public DeleteTemplateResponse deleteTemplate(String ID) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteTemplateWithOptions(ID, headers, runtime);
    }

    public DeleteTemplateResponse deleteTemplateWithOptions(String ID, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        ID = com.aliyun.openapiutil.Client.getEncodeParam(ID);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DeleteTemplate", "2021-03-25", "HTTPS", "DELETE", "AK", "/api/v1/templates/" + ID + "", "json", req, runtime), new DeleteTemplateResponse());
    }

    public CreateTemplateResponse createTemplate(CreateTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTemplateWithOptions(request, headers, runtime);
    }

    public CreateTemplateResponse createTemplateWithOptions(CreateTemplateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processInstanceID)) {
            body.put("ProcessInstanceID", request.processInstanceID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signatureID)) {
            body.put("SignatureID", request.signatureID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("CreateTemplate", "2021-03-25", "HTTPS", "POST", "AK", "/api/v1/templates", "json", req, runtime), new CreateTemplateResponse());
    }

    public ListTemplatesResponse listTemplates(ListTemplatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTemplatesWithOptions(request, headers, runtime);
    }

    public ListTemplatesResponse listTemplatesWithOptions(ListTemplatesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListTemplates", "2021-03-25", "HTTPS", "GET", "AK", "/api/v1/templates", "json", req, runtime), new ListTemplatesResponse());
    }

    public DeleteScheduleResponse deleteSchedule(String ID) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteScheduleWithOptions(ID, headers, runtime);
    }

    public DeleteScheduleResponse deleteScheduleWithOptions(String ID, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        ID = com.aliyun.openapiutil.Client.getEncodeParam(ID);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DeleteSchedule", "2021-03-25", "HTTPS", "DELETE", "AK", "/api/v1/schedules/" + ID + "", "json", req, runtime), new DeleteScheduleResponse());
    }

    public GetTemplateResponse getTemplate(String ID) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTemplateWithOptions(ID, headers, runtime);
    }

    public GetTemplateResponse getTemplateWithOptions(String ID, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        ID = com.aliyun.openapiutil.Client.getEncodeParam(ID);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetTemplate", "2021-03-25", "HTTPS", "GET", "AK", "/api/v1/templates/" + ID + "", "json", req, runtime), new GetTemplateResponse());
    }

    public ListSignaturesResponse listSignatures(ListSignaturesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSignaturesWithOptions(request, headers, runtime);
    }

    public ListSignaturesResponse listSignaturesWithOptions(ListSignaturesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListSignatures", "2021-03-25", "HTTPS", "GET", "AK", "/api/v1/signatures", "json", req, runtime), new ListSignaturesResponse());
    }

    public GetSignatureResponse getSignature(String ID) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSignatureWithOptions(ID, headers, runtime);
    }

    public GetSignatureResponse getSignatureWithOptions(String ID, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        ID = com.aliyun.openapiutil.Client.getEncodeParam(ID);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetSignature", "2021-03-25", "HTTPS", "GET", "AK", "/api/v1/signatures/" + ID + "", "json", req, runtime), new GetSignatureResponse());
    }

    public CreateScheduleResponse createSchedule(CreateScheduleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createScheduleWithOptions(request, headers, runtime);
    }

    public CreateScheduleResponse createScheduleWithOptions(CreateScheduleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataAddress)) {
            body.put("DataAddress", request.dataAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSource)) {
            body.put("DataSource", request.dataSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dingBotKeyword)) {
            body.put("DingBotKeyword", request.dingBotKeyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dingBotToken)) {
            body.put("DingBotToken", request.dingBotToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partition)) {
            body.put("Partition", request.partition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumberColumn)) {
            body.put("PhoneNumberColumn", request.phoneNumberColumn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sendTime)) {
            body.put("SendTime", request.sendTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signatureID)) {
            body.put("SignatureID", request.signatureID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateCodeColumn)) {
            body.put("TemplateCodeColumn", request.templateCodeColumn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateID)) {
            body.put("TemplateID", request.templateID);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("CreateSchedule", "2021-03-25", "HTTPS", "POST", "AK", "/api/v1/schedules", "json", req, runtime), new CreateScheduleResponse());
    }

    public ListSchedulesResponse listSchedules(ListSchedulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSchedulesWithOptions(request, headers, runtime);
    }

    public ListSchedulesResponse listSchedulesWithOptions(ListSchedulesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListSchedules", "2021-03-25", "HTTPS", "GET", "AK", "/api/v1/schedules", "json", req, runtime), new ListSchedulesResponse());
    }

    public UploadMediaByURLResponse uploadMediaByURL(UploadMediaByURLRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadMediaByURLWithOptions(request, headers, runtime);
    }

    public UploadMediaByURLResponse uploadMediaByURLWithOptions(UploadMediaByURLRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.uploadMetadatas)) {
            body.put("UploadMetadatas", request.uploadMetadatas);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadURLs)) {
            body.put("UploadURLs", request.uploadURLs);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.userData))) {
            body.put("UserData", request.userData);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("UploadMediaByURL", "2021-03-25", "HTTPS", "POST", "AK", "/api/v1/media/api/v1/video/upload", "json", req, runtime), new UploadMediaByURLResponse());
    }

    public DeleteSignatureResponse deleteSignature(String ID) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSignatureWithOptions(ID, headers, runtime);
    }

    public DeleteSignatureResponse deleteSignatureWithOptions(String ID, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        ID = com.aliyun.openapiutil.Client.getEncodeParam(ID);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DeleteSignature", "2021-03-25", "HTTPS", "DELETE", "AK", "/api/v1/signatures/" + ID + "", "json", req, runtime), new DeleteSignatureResponse());
    }
}
